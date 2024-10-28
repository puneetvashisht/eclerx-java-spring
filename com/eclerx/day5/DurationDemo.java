package com.eclerx.day5;

import java.time.Duration;
import java.time.Instant;

public class DurationDemo {
    public static void main(String[] args) throws InterruptedException{
       ;
        System.out.println( Duration.ofHours(2));


         Instant start = Instant.now();

         Thread.sleep(2000);
        // Instant end = now.plusSeconds(3000);

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toSeconds());
        // System.out.println("UTC : " + now);
    }
}
