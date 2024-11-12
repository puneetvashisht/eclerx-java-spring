package com.eclerx.spring_boot_final_demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eclerx.spring_boot_final_demo.entities.Course;
import com.eclerx.spring_boot_final_demo.repos.CourseRepository;
import com.eclerx.spring_boot_final_demo.utils.CourseNotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@RequestMapping(path = "/api/v1")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    public Page<Course> fetchAllCourses(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue="5") int size, 
                                        @RequestParam(defaultValue="id") String field,
                                        @RequestParam(defaultValue="asc") String sortDir) {
        // return courseRepository.findAll();
        // return courseRepository.findAllByOrderByTitleDesc();
        // return courseRepository.findAll(Sort.by("title").ascending());
        Sort sort = Sort.by(Sort.Direction.fromString(sortDir), field);
        PageRequest pageable = PageRequest.of(page, size, sort);
        return courseRepository.findAll(pageable);

    }

    @GetMapping("/courses/sort/{field}/{sortDir}")
    public List<Course> fetchAllCoursesSortedBy(@PathVariable("field") String field, @PathVariable("sortDir") String sortDir) {
        // return courseRepository.findAll();
        // return courseRepository.findAllByOrderByTitleDesc();
        if(sortDir.equalsIgnoreCase("ASC")){
            return courseRepository.findAll(Sort.by(field).ascending());
        }
        return courseRepository.findAll(Sort.by(field).descending());
        
    }

    @Operation(summary = "Fetch a course")
    @ApiResponses(value = {
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Course retrieved successfully"),
        @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "Course not found")
    })
    @GetMapping("/courses/{id}")
    public Course fetchCourseById(@PathVariable int id) {
        // return courseRepository.findById(id).orElse(null);
        return courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
    }

    @GetMapping("/courses/price/{price}")
    public List<Course> fetchCourseByPriceGreaterThan(@PathVariable double price) {
        // return courseRepository.findById(id).orElse(null);
        return courseRepository.findByPriceGreaterThanOrderByTitleAsc(price);
    }

    @GetMapping("/courses/pricebtw")
    public List<Course> fetchCourseByPriceBetween(@RequestParam("minPrice") double minPrice, @RequestParam("maxPrice") double maxPrice) {
        // return courseRepository.findById(id).orElse(null);
        return courseRepository.findSalariesBetween(minPrice, maxPrice);
    }

    @GetMapping("/courses/title/{title}")
    public List<Course> fetchCourseConainingTitle(@PathVariable String title) {
        // return courseRepository.findById(id).orElse(null);
        return courseRepository.findByTitleContaining(title);
    }

    @GetMapping("/courses/search")
    public List<Course> fetchCourseByTitle(@RequestParam("title") String title, @RequestParam("instructor") String instructor) {
        return courseRepository.findByTitleAndInstructor(title, instructor);
    }

    // @GetMapping("/courses/search")
    // public Course fetchCourseByTitle(@RequestParam("title") String title, @RequestParam("instructor") String instructor) {

    //     System.out.println(title);
    //     System.out.println(instructor);
    //     if(title != null && title!=""){
    //         Optional<Course> courseFound = courseRepository.findByTitle(title);
    //         if (courseFound.isEmpty()) {
    //             throw new CourseNotFoundException("Course not found with title: " + title);
    //         }
    //         return courseFound.get();
    //     }
    //     else if (instructor != null && instructor!="") {
    //         List<Course> courses = courseRepository.findByInstructor(instructor);
    //         System.out.println(courses);
    //         if (courses.size()<1) {
    //             throw new CourseNotFoundException("Course not found with title: " + title);
    //         }
    //         return courses.get(0);
    //     }
    //     throw new CourseNotFoundException("Course not found with title: " + title);
    // }

    @PostMapping("/courses")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCourse(@RequestBody Course entity) {
        courseRepository.save(entity);
    }

    @DeleteMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCourse(@PathVariable int id) {
        // courseRepository.deleteById(id);
        courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
        courseRepository.deleteById(id);
    }

    @PatchMapping("/courses")
    public void updateCourse(@RequestBody Course entity) {
        // courseRepository.save(entity);

        Optional<Course> courseFound = courseRepository.findById(entity.getId());

        if (courseFound.isPresent()) {
            Course course = courseFound.get();
            course.setInstructor(entity.getInstructor());
            courseRepository.save(course);
        } else {
            throw new CourseNotFoundException("Course not found with id: " + entity.getId());
        }
    }

}
