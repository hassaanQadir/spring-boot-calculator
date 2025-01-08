package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for CalculatorController methods.
 */
public class CalculatorControllerUnitTest {

    private final CalculatorController calculatorController = new CalculatorController();

    @Test
    public void testAdd() {
        double result = calculatorController.add(2, 3);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testSubtract() {
        double result = calculatorController.subtract(5, 3);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiply() {
        double result = calculatorController.multiply(4, 5);
        assertEquals(20.0, result, 0.001);
    }

    @Test
    public void testDivide() {
        double result = calculatorController.divide(10, 2);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorController.divide(10, 0);
        });
    }
}
