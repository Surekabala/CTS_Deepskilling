package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class EvenCheckerTest {
    @Test
    public void testEvenNumbers() {
        EvenChecker checker = new EvenChecker();
        int[] numbers = {2, 4, 6, 8, 10};
        for (int number : numbers) {
            assertTrue(checker.isEven(number));
        }
    }
}
