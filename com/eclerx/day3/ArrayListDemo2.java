package com.eclerx.day3;
import java.util.*;

class Fruit{
    String name;

    public Fruit(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fruit other = (Fruit) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Fruit [name=" + name + "]";
    }
    
}

public class ArrayListDemo2 {

    public static void main(String[] args) {
        // List<String> fruits = new ArrayList<>();
        // fruits.add("apple");
        // fruits.add("grapes");
        // fruits.add("mango");
        // fruits.add("banana");

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple"));
        fruits.add(new Fruit("grapes"));
        fruits.add(new Fruit("mango"));
        fruits.add(new Fruit("banana"));

        System.out.println(new Fruit("apple").equals(new Fruit("apple")));

        System.out.println(fruits);
        System.out.println(fruits.contains(new Fruit("apple")));

        
    }

   
}
