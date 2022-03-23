package com.learn.java.chapter11;

import java.time.*;
import java.util.Date;

public class FJavaToDBDateConversionExample {

    public static void main(String[] args) {

        //Convert java.util.Date to LocalDate ad vice versa
        Date date = new Date();
        System.out.println(date);
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println(localDate);

        Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date1);

        //Convert java.sql.Date to LocalDate ad vice versa
        java.sql.Date sDate = java.sql.Date.valueOf(localDate);
        System.out.println(sDate);
        LocalDate ld = sDate.toLocalDate();
        System.out.println(ld);

    }
}


