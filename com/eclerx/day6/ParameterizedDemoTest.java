package com.eclerx.day6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedDemoTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testIsPositive(int n){
        assertTrue(n > 0);

    }

    @ParameterizedTest
    @CsvSource({
         "abcd, 4",
            "abc, 3"
    })
    public void testStringLength(String input, int expectedLength){
        assertEquals(expectedLength, input.length());
    }
}
