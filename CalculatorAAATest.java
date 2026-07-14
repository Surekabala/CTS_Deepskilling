package com.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CalculatorAAATest {
    Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
        System.out.println("Before test");
    }

    @Test
    public void testAddition(){
        int a =4;
        int b=6;
        int result = calculator.add(a, b);
        assertEquals(10, result);
    }

    @After
    public void tearDown(){
        System.out.println("After test");
    }
}
