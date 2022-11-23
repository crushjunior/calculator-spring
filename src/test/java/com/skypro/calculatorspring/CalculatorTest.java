package com.skypro.calculatorspring;

import com.skypro.calculatorspring.exception.ZeroArgumentException;
import com.skypro.calculatorspring.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private CalculatorService calculatorService;
    private Double a, b, c, d;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
        a = 10d;
        b = 5d;
        c = 19d;
        d = 4d;
    }

@Test
    public void shouldReturnSum() {
        double expected = calculatorService.plus(a, b);
        double actual = a + b;
        assertEquals(actual, expected);

        expected = calculatorService.plus(c, d);
        actual = c + d;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMinus() {
        double expected = calculatorService.minus(a, b);
        double actual = a - b;
        assertEquals(actual, expected);

        expected = calculatorService.minus(c, d);
        actual = c - d;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMultiply() {
        double expected = calculatorService.multiply(a, b);
        double actual = a * b;
        assertEquals(actual, expected);

        expected = calculatorService.multiply(c, d);
        actual = c * d;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnDivide() {
        double expected = calculatorService.divide(a, b);
        double actual = a / b;
        assertEquals(actual, expected);

        expected = calculatorService.divide(c, d);
        actual = c / d;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroException() {
        assertThrows(ZeroArgumentException.class, () -> calculatorService.divide(a, 0d));
    }
}
