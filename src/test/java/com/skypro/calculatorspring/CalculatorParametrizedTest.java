package com.skypro.calculatorspring;

import com.skypro.calculatorspring.service.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParametrizedTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                    Arguments.of(43d, 6d),
                    Arguments.of(11d, 2d)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnSum(double a, double b) {
        double expected = calculatorService.plus(a, b);
        double actual = a + b;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnMinus(double a, double b) {
        double expected = calculatorService.minus(a, b);
        double actual = a - b;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnMultiply(double a, double b) {
        double expected = calculatorService.multiply(a, b);
        double actual = a * b;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnDivide(double a, double b) {
        double expected = calculatorService.divide(a, b);
        double actual = a / b;
        assertEquals(actual, expected);
    }
}



