package com.eclerx.spring_boot_final_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eclerx.spring_boot_final_demo.entities.Category;
import com.eclerx.spring_boot_final_demo.entities.Course;
import com.eclerx.spring_boot_final_demo.entities.Workout;
import com.eclerx.spring_boot_final_demo.repos.WorkoutRepository;
import com.eclerx.spring_boot_final_demo.services.WorkoutService;


@SpringBootTest
public class WorkoutRepositoryTests {

    @Autowired
	WorkoutRepository workoutRepository;


    @Autowired
    WorkoutService workoutService;


    @Test
    void fetchCourseFromAnotherService(){
        // Given
        Course course = workoutService.fetchCourseFromAnotherService();

        // Then
        assertEquals("VueJS", course.getTitle());
    }

	@Test
	void testWorkoutServiceSayHello() {

        Workout workout = new Workout("Yoga", 20, "best all season workout!");
        Category category = new Category("Flex"); 
        workout.setCategory(category);
        workoutRepository.save(workout);


		List<Workout> workouts = workoutRepository.findAll();
        System.out.println(workouts);
        assertEquals(3, workouts.size());
	}


    @Test
    void testWorkoutServiceFetchAllWorkoutsAndCourses() {
        Map<String, List<String>> combinedMap = workoutService.fetchAllWorkoutsAndCourses();
        System.out.println(combinedMap);

        assertEquals(3, combinedMap.get("workouts").size());
        assertEquals(2, combinedMap.get("courses").size());
    }
    
}
