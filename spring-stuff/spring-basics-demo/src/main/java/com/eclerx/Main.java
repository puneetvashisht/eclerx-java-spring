package com.eclerx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        // B b = new B();
        // A a = new A(b);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = context.getBean(A.class);


        a.display();
        System.out.println("Hello world!");

    
    }
}