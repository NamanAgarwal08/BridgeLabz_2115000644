package com.services;

//NumberUtilsTest.java

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
    NumberUtils numUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = { 2, 4, 6, 8, 10 })
    public void testIsEven(int number) {
        assertTrue(numUtils.isEven(number));
    }
}
