package com.eclerx.spring_boot_jpa_demo2.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException{

    public CourseNotFoundException(String message){
        super(message);
    }
    
}
