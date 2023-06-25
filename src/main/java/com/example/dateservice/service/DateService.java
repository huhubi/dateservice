package com.example.dateservice.service;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public LocalTime getTime() {
        return LocalTime.now();
    }


    public String getDate(String format) {
        LocalDate localDate = LocalDate.now();
        if (format != null) {
           //es wurde ein format übergeben
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return formatter.format(localDate);
        }
        //es wurde kein Format übergeben
        return localDate.toString();
    }

}
