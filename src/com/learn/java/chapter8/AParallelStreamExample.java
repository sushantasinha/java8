package com.learn.java.chapter8;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class AParallelStreamExample {

    public static void main(String[] args) {

        System.out.println("availableProcessors for this machine:" + Runtime.getRuntime().availableProcessors());

        System.out.println(checkPerformance(AParallelStreamExample::sequentialCall));
        System.out.println(checkPerformance(AParallelStreamExample::parallelCall));
    }


    private static long checkPerformance(Supplier<Integer> supplier){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 25; i++) {
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;

    }


    private static int sequentialCall() {
        return IntStream.range(1, 1000000).sum();
    }

    private static int parallelCall() {
        return IntStream.range(1, 1000000).parallel().sum();
    }
}