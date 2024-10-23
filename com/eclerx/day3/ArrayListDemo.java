package com.eclerx.day3;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // List<Integer> list = new LinkedList<>();
        Set<Integer> list = new HashSet<>();
        // list.add("a");
        // list.add("b");
        list.add(1);
        list.add(3);
        list.add(13);
        list.add(13);

        for(Object element : list){
            Integer x = (Integer) element;
            System.out.println(element);
        }

        System.out.println(list);

        // Integer i = 34;
    }
}
