package com.eclerx.day4;
import java.util.function.*;

public class ExistingFunctionalInterfaces {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (str, i)-> (str.length() == i);
        boolean result = biPredicate.test("abc", 33); 
        System.out.println(result);
    }
}
