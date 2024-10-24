package com.eclerx.day3;
import java.util.*;

class Fruit implements Comparable<Fruit>{
    String name;
    String color;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, String color) {
        this(name);
        this.color = color;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
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
        return "Fruit [name=" + name + ", color=" + color + "]";
    }

    @Override
    public int compareTo(Fruit o) {
        if(this.name.equals(o.name))
            return this.color.compareTo(o.color);
        return this.name.compareTo(o.name);
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
