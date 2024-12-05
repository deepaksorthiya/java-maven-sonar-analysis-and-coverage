package com.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private static Calculator calculator;
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorTest.class);

    @BeforeAll
    static void beforeAll() {
        LOGGER.info("Before All.");
        calculator = new Calculator();
    }

    @AfterAll
    static void afterAll() {
        LOGGER.info("After All.");
        calculator = null;
    }

    @AfterEach
    void afterEach() {
        LOGGER.info("After each.");
    }

    @BeforeEach
    void beforeEach() {
        LOGGER.info("Before each.");
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        assertEquals(2, calculator.addsTwoNumbers(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("1 - 1 = 0")
    void subtractsTwoNumbers() {
        assertEquals(0, calculator.subtractsTwoNumbers(1, 1), "1 - 1 should equal 0");
    }

    @Test
    @DisplayName("1 * 1 = 1")
    void multiplyTwoNumbers() {
        assertEquals(1, calculator.multiplyTwoNumbers(1, 1), "1 * 1 should equal 1");
    }

    @Test
    @DisplayName("1 / 1 = 1")
    void divideTwoNumbers() {
        assertEquals(1, calculator.divideTwoNumbers(1, 1), "1 / 1 should equal 1");
    }
}