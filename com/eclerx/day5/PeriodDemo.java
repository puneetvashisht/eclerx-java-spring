package com.eclerx.day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodDemo {
    public static void main(String[] args) {
        
        // Stamp localdate
        // LocalDate 
        LocalDateTime currentDateTime = LocalDateTime.now();
        currentDateTime.plusWeeks(2).plusDays(2).plusHours(2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        String formattedDateTime = currentDateTime.format(format);
        System.out.println(formattedDateTime);

        String trainingEndTime = "12:00:00";
        LocalTime trainingEnd = LocalTime.parse(trainingEndTime);
        System.out.println(trainingEnd);

        System.out.println(currentDateTime);
        LocalDateTime diwaliDateTime = LocalDateTime.of(2026, 1, 1, 9, 0);


        // Stamp diwali date
        // Period b/w Diwali

        Period period = Period.between(currentDateTime.toLocalDate(), diwaliDateTime.toLocalDate());
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Duration duration = Duration.between(currentDateTime, diwaliDateTime);
        // System.out.println(duration.toDays());
        // System.out.println(duration.toHours());
        // System.out.println(duration.toMinutes());


        // Duration




    }



//    paymentTranfer(){
//        // service.balanceEquiry()
//
//
//        // service.credit(amount)
//
//
//        // smsServie.send('message');
//    }
}
