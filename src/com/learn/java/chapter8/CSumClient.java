package com.learn.java.chapter8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CSumClient {

    public static void main(String[] args) {
        Sum sum1 = new Sum();
        IntStream.rangeClosed(1, 100000).forEach(sum1::performSum);
        System.out.println(sum1.getTotal());//ALWAYS: 705082704

        Sum sum2 = new Sum();
        IntStream.rangeClosed(1, 100000).parallel().forEach(sum2::performSum);
        System.out.println(sum2.getTotal()); // VARIABLE RESPONSE EVERY time,
        // as "total" in Sum is instance variable and multiple threads are trying to access the same, some additions are overridden, so incorrect response
    }


}