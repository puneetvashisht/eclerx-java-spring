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

public class ListOperations2 {

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
        Employee e6 = new Employee(51, "Isha", 33333.34);

        Employee empArray[]  = {e1, e2, e3, e4, e5, e6};

        List<Employee> employees = Arrays.asList(empArray);
        System.out.println(employees);

        // Print all the employees starting letter "R" in name
        System.out.println("---------- Printing with starting name 'R'");
        printEmployees(employees, (e) -> e.name.startsWith("R"));
        // printEmployees(employees , new Condition<Employee>(){
        //     @Override
        //     public boolean test(Employee e) {
        //        return e.name.startsWith("R");
        //     }          
        // });
        // for(Employee e: employees){
        //     if(e.name.startsWith("R")){
        //         System.out.println(e);
        //     }
        // }

        // Print all employees having salary > 30000
        System.out.println("--------- Printing with salary > 30000");
        printEmployees(employees, (e) -> e.getSalary() > 30000);
        // for(Employee e: employees){
        //     if(e.getSalary() > 30000){
        //         System.out.println(e);
        //     }
        // }

        // Print all the employees
        System.out.println("--------- Printing all employees");
        printEmployees(employees, (e) -> true);
        // for(Employee e: employees){
        //     System.out.println(e);
        // }
    }
}
