package com.eclerx.day2;

public class Car extends Vehicle{

    boolean automaticTransmission;

    public Car(int maxSpeed, String color, boolean automaticTransmission) {
        super(maxSpeed, color);
        this.automaticTransmission = automaticTransmission;
    }

    public Car(int maxSpeed, boolean b) {
        super(maxSpeed);
        this.automaticTransmission = b;
    }

    @Override
    public String toString() {
        return "Car [maxSpeed=" + maxSpeed + ", automaticTransmission=" + automaticTransmission + ", color=" + color
                + "]";
    }

    @Override
    public void shiftGear() {
       System.out.println("Shift gear using legs!");
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
