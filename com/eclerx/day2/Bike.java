package com.eclerx.day2;

public class Bike extends Vehicle{
    
    int noOfGears;

    public Bike(int maxSpeed, String color, int noOfGears) {
        super(maxSpeed, color);
        this.noOfGears = noOfGears;
    }

    public void changeGear(int gearNumber){
        this.noOfGears = gearNumber;
    }

    @Override
    public String toString() {
        return "Bike [maxSpeed=" + maxSpeed + ", noOfGears=" + noOfGears + ", color=" + color + "]";
    }

    
}
