package com.eclerx.spring_boot_final_demo.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eclerx.spring_boot_final_demo.dto.CombinedResponse;
import com.eclerx.spring_boot_final_demo.entities.Course;
import com.eclerx.spring_boot_final_demo.entities.Workout;
import com.eclerx.spring_boot_final_demo.repos.CourseRepository;
import com.eclerx.spring_boot_final_demo.repos.WorkoutRepository;

@Service
public class WorkoutService {

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    CourseRepository courseRepository;

    public String sayHello(){
        return "Hello from WorkoutService!";
    }


    public Course fetchCourseFromAnotherService(){
        // this localhost:9090 calls localhost:8080
        // RestTemplate -> call the RESTApi capture response
        Course c = new RestTemplate().getForObject("http://localhost:8080/api/v1/courses/102", Course.class);
        // Course c = course.getBody();
        System.out.println(c);
        return c;
    }

    public  Map<String, List<String>> fetchAllWorkoutsAndCourses() {
        // Fetch all workouts
        List<Workout> workouts = (workoutRepository.findAll());
        // Fetch all courses
        List<Course> courses = courseRepository.findAll();
        // Combine and return

        Map<String, List<String>> combinedMap = new HashMap<>();

         List<String> workoutStrings =workouts.stream()
        .map((w)-> w.getTitle())
        .toList();


        List<String> courseStrings =courses.stream()
        .map((w)-> w.getTitle())
        .toList();


        combinedMap.put("workouts", workoutStrings);
        combinedMap.put("courses", courseStrings);
        return combinedMap;

    }
    
}
