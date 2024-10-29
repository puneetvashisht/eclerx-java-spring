package com.eclerx;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calculator calculator = new Calculator();
        int result = calculator.add(23, 23);
        // print output
        System.out.println(result);
    }
}