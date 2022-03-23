package com.learn.java.chapter11;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class GDateTimeFormatterExample {

    public static void main(String[] args) {

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.htm
        //Check above link if the format i am looking for is already avl, if so we can reuse that

        // =========== LocalDate =======================
        String date = "2022-02-03";
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);
        System.out.println(LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE));

        String date2 = "2022|02|03";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy|MM|dd");//If the patter has #, this will NOT work
        LocalDate localDate1 = LocalDate.parse(date2, dtf);
        System.out.println(localDate1);

        //LocalDate to String
        String s = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s);

        // =========== LocalTime =======================
        //Similar like LocalDate

        // =========== LocalDateTime =======================
        //Similar like LocalDate

    }
}


