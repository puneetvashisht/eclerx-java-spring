package com.eclerx.day5;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> someStr = Optional.empty();
        // System.out.println(someStr.isPresent());
        // System.out.println(someStr.isEmpty());

        // if(someStr.isPresent()){
        //     System.out.println(someStr.get().length());
        // }

        // someStr = Optional.of("Hello World");
        // System.out.println(someStr.isPresent());
        // System.out.println(someStr.isEmpty());

        // System.out.println(someStr.get().length());

        // someStr.ifPresent(s -> System.out.println(s.length()));

        // someStr.orElse("Default value");

        // someStr.orElseGet(() -> "Default value");

        // someStr.orElseThrow(() -> new RuntimeException("Optional is empty"));
    }
}
