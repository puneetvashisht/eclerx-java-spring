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


    
    
}
