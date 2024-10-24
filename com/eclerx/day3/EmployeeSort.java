package com.eclerx.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Priya", 54343.34);
        Employee e2 = new Employee(13, "Amit", 24343.34);
        Employee e3 = new Employee(5, "Rahul", 34343.34);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Collections.sort(employees);
        System.out.println(employees);

        Collections.sort(employees, new NameComparator());
        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
            //    return (int)(o1.getSalary() - o2.getSalary());
                return o1.getSalary().compareTo(o2.getSalary());
            } 
        });

        System.out.println(employees);
    }
}
