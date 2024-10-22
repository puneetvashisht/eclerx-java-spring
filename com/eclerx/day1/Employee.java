package com.eclerx.day1;

public class Employee {

    // Member variable / fields of class 
    int id;
    String name;
    double salary;

    // methods 
    void incrementSalary(){
        salary = salary + 5000;
    }

    public static void main(String[] args) {
       Employee e1 = new Employee();
       e1.id =34;
       e1.name="Ravi";
       e1.salary=34343.34;

       System.out.println(e1.salary);

       e1.incrementSalary();

       System.out.println(e1.salary);
    }

}
