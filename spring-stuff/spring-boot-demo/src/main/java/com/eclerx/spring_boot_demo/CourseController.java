package com.eclerx.spring_boot_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CourseController {

    List<Course> courses = new ArrayList<>();
    {
        courses.add(new Course(1,"Java Fundamentals", "John Doe", 500.00));
        courses.add(new Course(2,"Spring Boot", "Jane Smith", 600.00));
        courses.add(new Course(3,"Microservices", "Bob Johnson", 700.00));
    }

    @GetMapping("/courses")
    public List<Course> fetchAllCourses(){
        return courses;
    }
    
    
}
