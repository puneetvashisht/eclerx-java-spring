package com.eclerx.day1;

public class Address {
    //fields
    int houseNumber;
    String street;
    String city;
    private int pinCode; 

    
    // getters and setters
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        if(pinCode > 0){
            this.pinCode = pinCode;
        } 
    }

    // constructor
    public Address(int houseNumber, String street, String city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }
    // methods
    public void changeHouseNumber(int newHouseNumber){
        /*  int i;
        System.out.println(pinCode);
        */
        houseNumber = newHouseNumber;
    }

    // string representation
    @Override
    public String toString() {
        return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode
                + "]";
    }
    

}
