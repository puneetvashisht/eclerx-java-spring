package com.eclerx.spring_boot_final_demo.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class WorkoutNotFoundException extends RuntimeException {
    
    public WorkoutNotFoundException(String message){
        super(message);
    }
}
