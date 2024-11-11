package com.eclerx.spring_boot_final_demo.utils;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(WorkoutNotFoundException.class)
    public ResponseEntity<String> handleException(WorkoutNotFoundException e){
        System.out.println("Exception ********************");
        e.printStackTrace();
        return new ResponseEntity<String>("Error: "+ e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<String> handleException(CategoryNotFoundException e){
        System.out.println("Exception ********************");
        e.printStackTrace();
        return new ResponseEntity<String>("Error: "+ e.getMessage(), HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ErrorReponse> handleException(DataIntegrityViolationException e){
        ErrorReponse errorReponse = new ErrorReponse("Entity already exists", 409);
        return new ResponseEntity<ErrorReponse>(errorReponse, HttpStatus.CONFLICT );
    }
}
