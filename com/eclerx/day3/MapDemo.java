package com.eclerx.day3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new TreeMap<>();
        
        Employee e1 = new Employee(1, "Priya", 54343.34);
        Employee e2 = new Employee(13, "Amit", 24343.34);
        Employee e3 = new Employee(5, "Rahul", 34343.34);
        employeeMap.put(1, e1);
        employeeMap.put(13, e2);
        employeeMap.put(5, e3);

        System.out.println(employeeMap);
        System.out.println(employeeMap.get(13));

        System.out.println(employeeMap.keySet());

        for(Integer key: employeeMap.keySet()){
            System.out.println(employeeMap.get(key));
        }

        for(Entry<Integer, Employee> employeeEntry : employeeMap.entrySet()){
            System.out.println(employeeEntry);
            System.out.println(employeeEntry.getKey());
            System.out.println(employeeEntry.getValue());
        }
    }
}
