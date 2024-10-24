package com.eclerx.day4;

import java.util.Arrays;
import java.util.List;

public class ListOperations {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Priya", 54343.34);
        Employee e2 = new Employee(13, "Amit", 24343.34);
        Employee e3 = new Employee(5, "Rahul", 34343.34);
        Employee e4 = new Employee(2, "Rakul", 55555.34);
        Employee e5 = new Employee(3, "Vanya", 22222.34);
        Employee e6 = new Employee(51, "Isha", 33333.34);

        Employee empArray[]  = {e1, e2, e3, e4, e5, e6};

        List<Employee> employees = Arrays.asList(empArray);
        System.out.println(employees);

        // Print all the employees starting letter "R" in name

        // Print all employees having salary > 30000

        // Print all the employees
    }
}
