package com.eclerx.day2;

public class TestInheritance {
    public static void main(String[] args) {
        Car car = new Car(250, "Black", true);
        System.out.println(car.toString());
        car.addMirror();
        car.addSeatCovers();


        Vehicle car1 = new Car(350, false);
        System.out.println(car1);
        car1.speedUp();
        // car1.changeGear(34);
        System.out.println(car1);

        //implicit typecasting
        Vehicle b1 = new Bike(150, "Grey", 5);
        b1.speedUp();
        b1.add(12);
        //explit typecasting
        Bike b2 = (Bike)b1;
        b2.changeGear(4);
        System.out.println(b1);

        // Vehicle v1 = new Vehicle(23);

        Vehicle vehicles[] = {car1, b1};
        for(Vehicle v: vehicles){
            v.speedUp();
            v.shiftGear();
            if(v instanceof Bike){
                Bike b = (Bike) v;
                b.changeGear();
            }
            // v.changeGear();
            System.out.println(v);
        }
    }
}
