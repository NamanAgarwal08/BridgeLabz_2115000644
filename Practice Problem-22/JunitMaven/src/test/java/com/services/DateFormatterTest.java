package com.services;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
    DateFormatter formatter = new DateFormatter();

    @Test
    public void testFormatDate() {
        assertEquals("15-08-2023", formatter.formatDate("2023-08-15"));
    }
}
