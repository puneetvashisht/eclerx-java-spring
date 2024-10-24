package com.eclerx.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        // List<String> fruits = new ArrayList<>();
        // fruits.add("apple");
        // fruits.add("grapes");
        // fruits.add("mango");
        // fruits.add("banana");

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Fruit("apple", "green"));
        fruits.add(new Fruit("grapes", "green"));
        fruits.add(new Fruit("mango", "yellow"));
        fruits.add(new Fruit("banana", "yellow"));


        System.out.println(fruits);
        // Collections.sort(fruits);

        Collections.sort(fruits, new ColorComparator());
        System.out.println(fruits);
    }
}
