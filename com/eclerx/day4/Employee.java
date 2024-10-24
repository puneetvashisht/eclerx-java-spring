package com.eclerx.day4;

public class Employee implements Comparable<Employee> {

    // Member variable / fields of class 
    int id;
    String name;
    private Double salary;


    
    public Double getSalary() {
        return salary;
    }



    // No arg constructor
    public Employee(){

    }


    
    // Constructor - initialize fields
    // public Employee(int id, String name, double salary){
    //     this.id = id;
    //     this.name = name;
    //     this.salary = salary;
    // }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }



    // methods 
    void incrementSalary(){
        salary = salary + 5000;
    }

    // @Override
    // public String toString() {
    //    return "Employee [ID: " + id + " Name: "+ name + " Salary : " + salary;
    // }

    public static void main(String[] args) {
       Employee e1 = new Employee();
       e1.id =34;
       e1.name="Ravi";
       e1.salary=34343.34;

       System.out.println(e1.salary);

       e1.incrementSalary();

       System.out.println(e1.salary);


       Employee e2 = new Employee();
    //    e2.salary = 5000;
       e2.incrementSalary();
       System.out.println(e2.salary);

       Employee e3 = new Employee(1, "Priya", 34343.34);
       System.out.println(e3.salary);
       e3.incrementSalary();
       System.out.println(e3.salary);

       System.out.println(e3);
    }


    @Override
    public int compareTo(Employee o) {
       return this.id - o.id;
    }

}
