package com.eclerx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    // hard-coupling
    // B b = new B();
    @Autowired
    B b;
    @Autowired
    C c;

    public A() {
        
    }
    public A(B b) {
        this.b = b;
    }

    

    public C getC() {
        return c;
    }
    public void setC(C c) {
        this.c = c;
    }
    public void display() {
        b.display();  // Calls the display method of B class
        c.display();
        System.out.println("Hello from A!");
    }
}
