package ru.dataart.academy.java;

public class NumberOutOfRangeException extends RuntimeException {

    public NumberOutOfRangeException() {
        super("Reverse number is out of range.");
    }
}
