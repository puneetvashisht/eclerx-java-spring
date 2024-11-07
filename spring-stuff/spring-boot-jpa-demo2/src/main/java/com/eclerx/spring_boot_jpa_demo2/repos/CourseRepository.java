package com.eclerx.spring_boot_jpa_demo2.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eclerx.spring_boot_jpa_demo2.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Optional<Course> findByTitle(String title);
    List<Course> findByInstructor(String instructor);

    // list of price greater than
    List<Course> findByPriceGreaterThan(double price);

    // list of courses title containing some string
    List<Course> findByTitleContaining(String title);

    List<Course> findByTitleAndInstructor(String title, String instructor);


    
}
