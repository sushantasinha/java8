package com.learn.java.chapter6;

import com.learn.java.common.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static com.learn.java.common.Common.printDivider;

public class ANumericStreamExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6, 7);
        System.out.println(list.stream().reduce(0, Integer::sum));//Unboxing to convert the Integer to int

        printDivider();

        //Better Approach
        System.out.println(IntStream.rangeClosed(1, 7).sum());//Does not do unboxing

        //when we operate with number,  should use numeric streams (like, IntStream), thn regular stream()

        IntStream.rangeClosed(1, 7).forEach(System.out::println); printDivider();
        IntStream.range(1, 7).forEach(System.out::println); printDivider();
        LongStream.rangeClosed(1, 7).forEach(System.out::println); printDivider();
        LongStream.range(1, 7).forEach(System.out::println); printDivider();
        IntStream.range(1, 7).asDoubleStream().forEach(System.out::println); printDivider();

        System.out.println(IntStream.rangeClosed(1, 7).max());//Returns OptionalInt
        System.out.println(IntStream.rangeClosed(1, 7).min());//Returns OptionalInt

        System.out.println(IntStream.rangeClosed(0, 0).min());
        System.out.println(IntStream.rangeClosed(4, 2).min()); //OptioanlInt.empty
        //System.out.println(IntStream.rangeClosed(4, 2).min().getAsInt()); //Exception as No value present

        System.out.println(IntStream.rangeClosed(1, 7).average());//Returns OptionalDouble



    }
}