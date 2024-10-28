package com.eclerx.day5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Fruit {
    String name;


    public Fruit(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Fruit [name=" + name + "]";
    }

    
}

public class MethodReferencesDemo {


    public static String toUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Priya", "Swati", "Rahul");

        names.stream()
        // .map((n)-> n.toUpperCase())
        .map(MethodReferencesDemo::toUpperCase)
        .forEach(System.out::println);


        System.out.println("------------");
        String prefix = "Dr. ";
        Function<String, String> addPrefix = (name) -> prefix + name;

        names.stream()
        .map(addPrefix)
        .forEach(System.out::println);

        System.out.println("------------");
        List<Fruit> fruits = names.stream()
        .map(Fruit::new)
        .toList();

        System.out.println(fruits);
        // .forEach(System.out::println);

    }
}
