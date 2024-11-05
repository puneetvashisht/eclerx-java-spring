package com.eclerx.spring_boot_demo;

public class Course {
    int id;
    String title;
    String instructor;
    double price;

    public Course(){}
    public Course(int id, String title, String instructor, double price) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor + ", price=" + price + "]";
    }

    

}
