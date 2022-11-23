package com.skypro.calculatorspring.service;

import com.skypro.calculatorspring.exception.ZeroArgumentException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String welcome() {
        String welcome = new String("Добро пожаловать в калькулятор");
        return welcome;
    }

    public Double plus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры для сложения не переданы");
       } else {
            return num1 + num2;
       }
    }

    public Double minus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры для вычитания не переданы");
        } else {
            return num1 - num2;
        }
    }

    public Double multiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры для умножения не переданы");
        } else {
            return num1 * num2;
        }
    }

    public Double divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Параметры для деления не переданы");
        }
        if (num2 == 0) {
            throw new ZeroArgumentException("На 0 делить нельзя");
        } else {
            return num1 / num2;
        }
    }
}
