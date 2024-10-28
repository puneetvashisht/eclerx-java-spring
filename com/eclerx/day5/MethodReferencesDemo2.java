package com.eclerx.day5;

import java.util.function.Function;

public class MethodReferencesDemo2 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;
        // Function<String, Integer> stringLength =(s) -> s.length());
        int result = stringLength.apply("abcd");
        System.out.println(result);
    }
}
