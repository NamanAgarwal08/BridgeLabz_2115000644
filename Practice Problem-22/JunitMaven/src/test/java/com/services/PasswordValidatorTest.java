package com.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValid("Test1234"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(validator.isValid("test"));
    }
}
