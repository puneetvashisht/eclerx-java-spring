package com.eclerx.spring_boot_final_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.web.client.RestTemplate;

import com.eclerx.spring_boot_final_demo.controllers.WorkoutController;
import com.eclerx.spring_boot_final_demo.entities.Category;
import com.eclerx.spring_boot_final_demo.entities.Workout;
import com.eclerx.spring_boot_final_demo.repos.WorkoutRepository;

@SpringBootTest
@AutoConfigureMockMvc
public class WorkoutControllerTests {

    @Autowired
    WorkoutController workoutController;

    @Autowired
    WorkoutRepository workoutRepository;

    @Autowired
    MockMvc mockMvc;


    @Test
    public void testWorkoutFetchWithMocking() throws Exception{

        Workout workout = new Workout("Yoga6", 20, "best all season workout!");
        Category category = new Category("Flex6"); 
        workout.setCategory(category);
        workoutRepository.save(workout);


        mockMvc.perform(get("/api/v1/workouts/"+workout.getId()))
        .andExpect(status().isOk())
            // .andExpect(status().isNotFound());
            .andExpect(jsonPath("$.title").value("Yoga5"));
    }
    
    @Test
    public void testWorkoutFetch(){

        // Workout workout = workoutController.fetchAllWorkouts(1);
        
        // assertEquals("Resistance Band Trainig", workout.getTitle());

        //  Workout workout = new Workout("Yoga1", 20, "best all season workout!");
        // Category category = new Category("Flex1"); 
        // workout.setCategory(category);
        // // workoutRepository.save(workout);

        // workoutController.addWorkout(workout);

         Workout workout = new RestTemplate().getForObject("http://localhost:9090/api/v1/workouts/1", Workout.class);
        // Course c = course.getBody();
        System.out.println(workout);
        assertEquals("Resistance Band Trainig", workout.getTitle());
    }
}
