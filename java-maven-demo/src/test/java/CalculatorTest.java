


import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.eclerx.Calculator;

public class CalculatorTest {

    static Calculator calculator = null;

    @BeforeAll
    public static void setUpOnce(){
        System.out.print("Run only once ....");
        calculator = new Calculator();
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Run before every test case...");
    }

    @Test
    public void testAdd(){

        int result = calculator.add(2,3);
        assertSame(5, result);
//        assertTrue(false);
    }

    @Test
    public void testAddWithNegativeValues(){
//        Calculator calculator = new Calculator();
//        int result = calculator.add(-2,-3);
        int result = calculator.add(-2,-3);
        assertSame(-5, result);
//        assertTrue(false);
    }

}
