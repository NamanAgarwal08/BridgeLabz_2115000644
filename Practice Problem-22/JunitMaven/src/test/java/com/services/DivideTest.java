package com.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideTest {
    public int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    @Test
    public void testExceptionHandling() {
        assertThrows(ArithmeticException.class, () -> divide(5, 0));
    }
}
