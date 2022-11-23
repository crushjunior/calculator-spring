package com.skypro.calculatorspring.exception;

public class ZeroArgumentException extends IllegalArgumentException {
    public ZeroArgumentException() {
    }

    public ZeroArgumentException(String s) {
        super(s);
    }
}
