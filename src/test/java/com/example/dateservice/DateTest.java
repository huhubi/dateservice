package com.example.dateservice;


import com.example.dateservice.service.DateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DateTest {


    @Autowired
    private DateService dateService;

    @Test
    public void testGetTime() {
        //A-A-A
        //Arrange, Act, Assert
        assertThat(dateService.getTime()).isBeforeOrEqualTo(LocalTime.now());
    }


}
