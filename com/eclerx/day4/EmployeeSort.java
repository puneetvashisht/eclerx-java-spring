package com.eclerx.day4;

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

        Collections.sort(employees, (emp1, emp2)-> {
            System.out.println("em" + emp1);
            return emp1.name.compareTo(emp2.name);
        });
        System.out.println(employees);

        Collections.sort(employees, (emp1, emp2)-> emp1.getSalary().compareTo(emp2.getSalary()));

        System.out.println(employees);
    }
}
