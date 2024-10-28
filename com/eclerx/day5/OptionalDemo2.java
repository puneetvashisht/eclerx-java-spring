package com.eclerx.day5;

import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        String nullableString = null;

        Optional<String> optionalValue = Optional.ofNullable(nullableString);

        if(optionalValue.isPresent()){
            System.out.println("Get the value: " + optionalValue.get());
        }
        else{
            System.out.println("Optional is empty");
        }

        String result =  optionalValue.orElseGet(() -> "Default value");
        System.out.println("Result " + result);

       

        optionalValue.orElseThrow(() -> new RuntimeException("Optional is empty"));
    }
}
