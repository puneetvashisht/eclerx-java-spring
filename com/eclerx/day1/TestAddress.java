package com.eclerx.day1;

public class TestAddress {

    public static void main(String[] args) {
       
        Address address1 = new Address(23, "Jangpura", "New Delhi");
        System.out.println(address1.getPinCode());
        address1.setPinCode(100223);
        System.out.println(address1.getPinCode());
        System.out.println(address1);

        address1.changeHouseNumber(32);
        System.out.println(address1);
    }
    
}
