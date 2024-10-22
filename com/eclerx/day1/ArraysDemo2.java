package com.eclerx.day1;

public class ArraysDemo2 {
    public static void main(String[] args) {
       Address add1 = new Address(23, "Hinjewadi", "Pune");
       Address add2 = new Address(23, "Marathalli", "Bengaluru");

    //    Address addresses[] = {add1, add2};
        Address addresses[] = new Address[2];
        addresses[0] = add1;
        addresses[1] = add2;

       System.out.println(addresses[0]);

       for(Address a: addresses){
        System.out.println(a);
       }
    
    }
}
