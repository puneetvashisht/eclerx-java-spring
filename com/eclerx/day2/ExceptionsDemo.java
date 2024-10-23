package com.eclerx.day2;

public class ExceptionsDemo {

    public static void m2(int input) throws InvalidInputException {
        if(input <= 0){
            throw new InvalidInputException("Input is wrong less than zero!");
        }
        int result = 34 / input;
        System.out.println("m2 method");
    }

    public static void m1() throws InvalidInputException {

        m2(0);
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        try {
            m1();
        } 
        catch (InvalidInputException e) {
            // m2(2);
            e.printStackTrace();
            System.out.println("Input passed is wrong!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
            System.out.println("Always works!");
        }
        System.out.println("Allz well!");
    }
}
