package com.eclerx.spring_boot_jpa_demo2.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eclerx.spring_boot_jpa_demo2.entities.Course;
import com.eclerx.spring_boot_jpa_demo2.repos.CourseRepository;
import com.eclerx.spring_boot_jpa_demo2.utils.CourseNotFoundException;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping(path = "/api/v1")
public class CourseController {
    
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> fetchAllCourses(){
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course fetchCourseById(@PathVariable int id) {
        // return courseRepository.findById(id).orElse(null);
        return courseRepository.findById(id).orElseThrow(() -> new CourseNotFoundException("Course not found with id: " + id));
    }


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

        if(courseFound.isPresent()){
            Course course = courseFound.get();
            course.setInstructor(entity.getInstructor());
            courseRepository.save(course);
        }
        else{
            throw new CourseNotFoundException("Course not found with id: " + entity.getId());
        }
    }
    
    
}
