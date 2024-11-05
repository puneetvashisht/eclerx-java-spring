package com.eclerx.spring_boot_demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Spring Web!";
    }

    @GetMapping("/time")
    public LocalDateTime localTime(){
        return LocalDateTime.now();
    }
    
}
