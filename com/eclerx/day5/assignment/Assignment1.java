package com.eclerx.day5.assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Assignment1 {
    public static void main(String[] args) {
         List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("banana");


        fruits.stream()
        .sorted(Comparator.comparingInt(String::length))
        .forEach(System.out::println);


        // String searchName = "pineapple";
        //   Optional<String> foundName = fruits.stream()
        //                                    .filter(name -> name.equalsIgnoreCase(searchName))
        //                                    .findFirst();

        // // Handle the Optional value
        // foundName.ifPresentOrElse(
        //     name -> System.out.println("Found name: " + name), // if present
        //     () -> System.out.println("Name not found: " + searchName) // if absent
        // );


        // String result = foundName.orElse("default");
        // System.out.println(result);



        // 1. sort this list by string length 

        // 2. findFirst mango

        // if optional value is present then print

        // else suppy a default value

    }
}
