package com.learn.java.chapter11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ADateTime1Example {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now()); //Local datetime of machine
        System.out.println(LocalDate.of(2022, 02, 20));
        System.out.println(LocalDate.ofYearDay(2022, 364));//OUTPUT: 2022-12-30

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();

        System.out.println(localDateTime.getMonth());//MARCH
        System.out.println(localDateTime.getMonthValue());//7
        System.out.println(localDateTime.getDayOfYear());//81
        System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR)); //81

        //Modifying local date
        System.out.println();

        System.out.println(localDate.plusDays(2));//Does not change the original object, as it is immutable in nature: 2022-03-24
        System.out.println(localDate.withYear(2020));//2020-03-22
        System.out.println(localDate.with(ChronoField.YEAR, 2018));//2018-03-22

        //TemporalAdjusters has lot of utility methods
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfNextMonth()));//2022-04-01
        System.out.println(localDate.minus(8, ChronoUnit.YEARS));//2014-03-22
        System.out.println(localDate.isLeapYear());//false
        System.out.println(LocalDate.ofYearDay(2020, 1).isLeapYear());//false

        System.out.println(localDate.isEqual(LocalDate.now()));//true
        //isBefore
        //ifAfter

        //Unsupported as local date does not have time, so, it will throw exception
        //System.out.println(localDate.minus(1, ChronoUnit.MINUTES));
        System.out.println(localDate.isSupported(ChronoUnit.MINUTES));//false
        System.out.println(localDate.isSupported(ChronoUnit.YEARS));//true

        LocalTime localTime = LocalTime.now();
        System.out.println(LocalDateTime.now()); //Local datetime of machine
        System.out.println(localTime.toSecondOfDay());

        //Convert LocalDate/LocalTime to LocalDateTime abd Vice versa
        LocalDateTime ldt = localDate.atTime(23, 33);
        System.out.println(ldt);//2022-03-22T23:33

        ldt = localTime.atDate(LocalDate.of(2020, 1, 2));
        System.out.println(ldt);//2020-01-02T11:25:49.433569400

        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

    }
}


