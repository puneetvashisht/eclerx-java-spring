package com.eclerx.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Fruit> fruits = new TreeSet<>( new ColorComparator());
        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Fruit("grapes", "green"));
        fruits.add(new Fruit("mango", "yellow"));
        fruits.add(new Fruit("banana", "green"));
        fruits.add(new Fruit("banana", "yellow"));

        System.out.println(fruits);
        // System.out.println(fruits.contains(new Fruit("pineapple")));

    }
}
