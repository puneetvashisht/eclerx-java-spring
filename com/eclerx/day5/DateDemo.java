package com.eclerx.day5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalUnit;

public class DateDemo {
    public static void main(String[] args) {

        LocalDateTime rightNow = LocalDateTime.now();
        // rightNow.plus(24, TemporalUnit.);
        LocalDateTime after24Hours = rightNow.plusHours(24);
        System.out.println(after24Hours);
        System.out.println(rightNow); 
    

        LocalDate diwaliDate = LocalDate.of(2024, 11, 1);
        System.out.println(diwaliDate);

        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoTime);

        Instant now = Instant.now();
        // now.plusSeconds(3000);
        System.out.println("UTC : " + now);

    }
}
