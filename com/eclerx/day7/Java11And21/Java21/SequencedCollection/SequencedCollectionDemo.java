package SequencedCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.SequencedCollection;

public class SequencedCollectionDemo {

    public static void main(String[] args) {
        // Example using ArrayList (which is a SequencedList)
        System.out.println("Using SequencedList (ArrayList):");
        SequencedCollection<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        System.out.println("First element: " + list.getFirst());  // Java
        System.out.println("Last element: " + list.getLast());    // JavaScript

        list.addFirst("C++");
        list.addLast("Go");

        System.out.println("After adding elements:");
        list.forEach(System.out::println);  // C++, Java, Python, JavaScript, Go

        System.out.println("Reversed order:");
        list.reversed().forEach(System.out::println);  // Go, JavaScript, Python, Java, C++

        // Example using LinkedHashSet (which is a SequencedSet)
        System.out.println("\nUsing SequencedSet (LinkedHashSet):");
        SequencedCollection<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("First element: " + set.getFirst());  // 10
        System.out.println("Last element: " + set.getLast());    // 30

        set.addFirst(5);
        set.addLast(40);

        System.out.println("After adding elements:");
        set.forEach(System.out::println);  // 5, 10, 20, 30, 40

        System.out.println("Reversed order:");
        set.reversed().forEach(System.out::println);  // 40, 30, 20, 10, 5
    }
}

