package com.learn.java.chapter8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//IGNORE this class
public class BParallelStreamVsStreamExample {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int i = getStream().stream().reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("sequential: " + (endTime - startTime) );


        startTime = System.currentTimeMillis();
        i = getStream().parallelStream().reduce(0, Integer::sum);
        endTime = System.currentTimeMillis();
        System.out.println("parallel: " + (endTime - startTime) );

    }

    private static List<Integer> getStream() {
        return IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
    }


}