package com.learn.java.chapter11;

import java.time.LocalDate;
import java.time.Period;

public class BPeriod1Example {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate localDate1 = LocalDate.of(2018, 12, 31);
        Period period = localDate.until(localDate1);
        System.out.println(period.getDays());//just comparing between days, does not consider month
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        Period period1 = Period.ofYears(10);
        System.out.println(period1.getYears());
        System.out.println(period1.toTotalMonths());
        Period period2 = Period.between(localDate, localDate1);
        System.out.println(period2.getYears() + " Years " + period2.getMonths() + " Months "  + period2.getDays() + " Days");

    }
}


