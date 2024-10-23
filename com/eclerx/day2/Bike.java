package com.eclerx.day2;

public class Bike extends Vehicle{
    
    int noOfGears;

    public Bike(int maxSpeed, String color, int noOfGears) {
        super(maxSpeed, color);
        this.noOfGears = noOfGears;
    }

    public void changeGear(){
        this.noOfGears = 1;
    }
    public void changeGear(int gearNumber){
        this.noOfGears = gearNumber;
    }

    @Override
    public String toString() {
        return "Bike [maxSpeed=" + maxSpeed + ", noOfGears=" + noOfGears + ", color=" + color + "]";
    }

    @Override
    public void shiftGear() {
       System.out.println("Shift gear using hands!");
    }

    @Override
    public void addMobileHolder() {
        System.out.println("Adding mobile holder");
    }

    @Override
    public void addMirror() {
        System.out.println("Adding mirror");
    }

    @Override
    public void addSeatCovers() {
        System.out.println("Adding seat covers");
    }

    @Override
    public void add(int Amps) {
        System.out.println("Adding battery with : " + Amps);
    }
}
