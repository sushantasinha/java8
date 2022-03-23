package com.learn.java.chapter11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CDurationExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(1, 10, 5);
        LocalTime localTime1 = LocalTime.of(2, 12, 10);
        long duration = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println(duration);

        Duration d = Duration.between(localTime, localTime1);
        System.out.println(d.getSeconds());
        System.out.println(d.toMinutes());

        LocalTime lt = localTime.plus(100, ChronoUnit.MINUTES);
        System.out.println(lt.getHour());

    }
}


