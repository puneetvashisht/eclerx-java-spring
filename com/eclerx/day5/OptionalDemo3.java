package com.eclerx.day5;

import java.util.Optional;

public class OptionalDemo3 {
    public static void main(String[] args) {
        Optional<Integer> yearOptional = Optional.of(2024);

        boolean is2019 = yearOptional.filter(y -> y == 2024).isPresent();
        System.out.println(is2019);
    }
}
