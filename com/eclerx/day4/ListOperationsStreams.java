package com.eclerx.day4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Condition
 */
// @FunctionalInterface
//  interface Condition<T> {
//     boolean test(T t);
// }

public class ListOperationsStreams {

    public static void printEmployees(List<Employee> employees, Predicate<Employee> predicate){
        for(Employee e: employees){
            // if(e.name.startsWith("R")){
            if(predicate.test(e)){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Priya", 54343.34);
        Employee e2 = new Employee(13, "Amit", 24343.34);
        Employee e3 = new Employee(5, "Rahul", 34343.34);
        Employee e4 = new Employee(2, "Rakul", 55555.34);
        Employee e5 = new Employee(3, "Vanya", 22222.34);
        Employee e6 = new Employee(51, "Isha", 22222.34);

        Employee empArray[]  = {e1, e2, e3, e4, e5, e6};

        List<Employee> employees = Arrays.asList(empArray);

        System.out.println("---------- Printing with starting name 'R'");
        employees.stream()
        .filter((e)-> e.name.startsWith("R"))
        // .forEach((e)-> System.out.println(e));
        .forEach(System.out::println);

        System.out.println("--------- Printing with salary > 30000");
        employees.stream()
        .filter((e)-> e.getSalary() > 30000)
        .forEach((e)-> System.out.println(e));

        System.out.println("--------- Printing all employees");
        employees.stream()
        .forEach((e)-> System.out.println(e));


        System.out.println("--------- Printing all salaries");
        long totalCount = employees.stream()
        // .map(e-> e.getSalary())
        // // .distinct()
        // .skip(2)
        // .limit(3)
        .count();
        // .forEach((e)-> System.out.println(e));

        System.out.println(totalCount);
    }
}
