package com.eclerx.spring_boot_final_demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eclerx.spring_boot_final_demo.entities.Category;
import com.eclerx.spring_boot_final_demo.entities.Workout;
import com.eclerx.spring_boot_final_demo.repos.CategoryRepository;
import com.eclerx.spring_boot_final_demo.repos.WorkoutRepository;
import com.eclerx.spring_boot_final_demo.services.WorkoutService;
import com.eclerx.spring_boot_final_demo.utils.CategoryNotFoundException;
import com.eclerx.spring_boot_final_demo.utils.WorkoutNotFoundException;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;



@RestController
// @CrossOrigin
@RequestMapping("/api/v1")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @PostMapping("/workouts")
    @ResponseStatus(HttpStatus.CREATED)
    public void addWorkout(@RequestBody Workout entity) {
        if(entity.getCategory().getId() > 0){
           Optional<Category> categoryFound = categoryRepository.findById(entity.getCategory().getId());
           if(categoryFound.isPresent()){
                entity.setCategory(categoryFound.get());
           }
           else{
                throw new CategoryNotFoundException("Category not found with id: " + entity.getCategory().getId());
           }
        }
        workoutRepository.save(entity);
    }

    @GetMapping("/workouts")
    public List<Workout> fetchAllWorkouts() {
        return workoutRepository.findAll();
    }

    @GetMapping("/workouts/{id}")
    public Workout fetchAllWorkouts(@PathVariable int id) {
        return workoutRepository.findById(id).orElseThrow(() -> new WorkoutNotFoundException("Workout not found with id: " + id));
    }

    @GetMapping("/workoutsandcourses")
    public  Map<String, List<String>> fetchAllWorkoutsAndCourses() {
        // Fetch all workouts
        return workoutService.fetchAllWorkoutsAndCourses();
        // Fetch all courses
        // Combine and return
    }
    


    // @ExceptionHandler(WorkoutNotFoundException.class)
    // public ResponseEntity<String> handleException(WorkoutNotFoundException e){
    //     System.out.println("Exception ********************");
    //     e.printStackTrace();
    //     return new ResponseEntity<String>("Error: "+ e.getMessage(), HttpStatus.NOT_FOUND);
    // }
    
    

}
