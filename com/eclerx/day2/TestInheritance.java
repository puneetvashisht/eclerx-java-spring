package com.eclerx.day2;

public class TestInheritance {
    public static void main(String[] args) {
        Car car = new Car(250, "Black", true);
        System.out.println(car.toString());

        Vehicle car1 = new Car(350, false);
        System.out.println(car1);
        car1.speedUp();
        // car1.changeGear(34);
        System.out.println(car1);

        //implicit typecasting
        Vehicle b1 = new Bike(150, "Grey", 5);
        b1.speedUp();
        //explit typecasting
        Bike b2 = (Bike)b1;
        b2.changeGear(4);
        System.out.println(b1);

        Vehicle vehicles[] = {car1, b1};
        for(Vehicle v: vehicles){
            v.speedUp();
            // v.changeGear();
            System.out.println(v);
        }
    }
}
