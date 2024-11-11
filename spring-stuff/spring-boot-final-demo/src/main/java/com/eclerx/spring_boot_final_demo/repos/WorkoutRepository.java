package com.eclerx.spring_boot_final_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclerx.spring_boot_final_demo.entities.Workout;

public interface  WorkoutRepository extends JpaRepository<Workout, Integer> {
    
}
