package com.learn.java.chapter11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DInstantExample {

    public static void main(String[] args) {

        Instant instant = Instant.now(); //machine readable format
        System.out.println(instant); //To string method here convert the data into human readable format,
        System.out.println(instant.getEpochSecond());
        //JAN 1st 1970: Epoch -> 86400 seconds
        System.out.println(Instant.ofEpochSecond(0));
        Instant instant1 = Instant.now();
        int r = Duration.between(instant, instant1).getNano();//using Nano here, as instant, instant1 will hv very min diff
        System.out.println(r);
    }
}


