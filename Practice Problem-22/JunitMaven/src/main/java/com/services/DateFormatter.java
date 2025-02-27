package com.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String inputDate) {
        return LocalDate.parse(inputDate).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}
