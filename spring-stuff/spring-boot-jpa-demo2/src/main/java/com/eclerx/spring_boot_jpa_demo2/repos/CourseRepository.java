package com.eclerx.spring_boot_jpa_demo2.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.eclerx.spring_boot_jpa_demo2.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    Optional<Course> findByTitle(String title);
    List<Course> findByInstructor(String instructor);

    // list of price greater than
    // List<Course> findByPriceGreaterThan(double price);
    List<Course> findByPriceGreaterThanOrderByTitleAsc(double price);

    // list of courses title containing some string
    List<Course> findByTitleContaining(String title);

    List<Course> findByTitleAndInstructor(String title, String instructor);

    // order by title
    List<Course> findAllByOrderByTitleDesc();

    // sort
    List<Course> findAll(Sort sort);

    // pagination
    Page<Course> findAll(Pageable pageable);

    @Query(value = "select c from Course c where c.price between :minPrice and :maxPrice ORDER BY c.title ASC")
    List<Course> findSalariesBetween(double minPrice, double maxPrice);


    
}
