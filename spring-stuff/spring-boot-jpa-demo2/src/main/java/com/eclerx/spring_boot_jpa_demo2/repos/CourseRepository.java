package com.eclerx.spring_boot_jpa_demo2.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclerx.spring_boot_jpa_demo2.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    
}
