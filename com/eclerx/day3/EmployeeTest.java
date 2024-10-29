package com.eclerx.day3;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {


    @Test
    public void testIncrement(){
        Employee employee = new Employee(12, "Ravi", 5000.0);

        employee.incrementSalary();

        assertNotNull(employee);
        assertEquals(10000.0, employee.getSalary());
    }

    @Test
    public void testIncrementForNegativeSalary(){
        Employee employee = new Employee(12, "Ravi", -5000.0);
        assertThrows(RuntimeException.class, () -> {
            employee.incrementSalary();
        });

        assertThrows(ArithmeticException.class, ()-> {
            int result = 3/0;
        });

        assertThrows(NullPointerException.class, ()-> {
            String str = null;
            str.charAt(0);
        });
    }
}
