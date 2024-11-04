package com.eclerx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
public class TestA {

    @Autowired
    A a;

    @Test
    public void testDisplay() {
        // A a = new A();
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // A a = context.getBean(A.class);
        a.display();
        // Test the display method
        // Assert.assertEquals("Hello from A!", a.display());
    }

    @Test
    public void testSayHello() {

        String hello = a.sayHello();
     
        assertEquals("Hello from A!", a.sayHello());
    }
    
}
