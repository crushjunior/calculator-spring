package com.skypro.calculatorspring.controller;

import com.skypro.calculatorspring.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

@GetMapping("")
    public String getWelcome() {
        return calculatorService.welcome();
}

    @GetMapping("/plus")
    public String getPlus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return String.format("%.0f + %.0f = %.0f", num1, num2, calculatorService.plus(num1, num2));
    }

    @GetMapping("/minus")
    public String getMinus(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return String.format("%.0f - %.0f = %.0f", num1, num2, calculatorService.minus(num1, num2));
    }

    @GetMapping("/multiply")
    public String getMultiply(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return String.format("%.0f * %.0f = %.0f", num1, num2, calculatorService.multiply(num1, num2));
    }

    @GetMapping("/divide")
    public String getDivide(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return String.format("%.0f / %.0f = %.2f", num1, num2, calculatorService.divide(num1, num2));
    }
}
