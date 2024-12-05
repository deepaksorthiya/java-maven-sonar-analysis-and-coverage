package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple Calculator Example
 */
public class Calculator {

    private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

    public int addsTwoNumbers(int a, int b) {
        LOGGER.info("Adding two numbers: {} + {} = {}", a, b, a + b);
        return a + b;
    }

    public int subtractsTwoNumbers(int a, int b) {
        LOGGER.info("Subtracting two numbers: {} - {} = {}", a, b, a - b);
        return a - b;
    }

    public int multiplyTwoNumbers(int a, int b) {
        LOGGER.info("Multiplying two numbers: {} * {} = {}", a, b, a * b);
        return a * b;
    }

    public int divideTwoNumbers(int a, int b) {
        LOGGER.info("Dividing two numbers: {} / {} = {}", a, b, a / b);
        return a / b;
    }
}
