package com.learn.java.chapter6;

import com.learn.java.common.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static com.learn.java.common.Common.printDivider;

public class ANumericStream2Example {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6, 7);

        //boxing
        List<Integer> i = IntStream.range(1, 8)
                .boxed()//input int and output Integer. If we don use this it will not save in List<Integer>, as there will be compilation error
                .collect(Collectors.toList());

        //unboxing
        list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        //mapToObject()
        List<Student> list1 = IntStream.range(1, 8)
                .mapToObj(j -> {
                    Student s = new Student();
                    s.setGpa(j);
                    return s;
                })
                .collect(Collectors.toList());

        list1.forEach(System.out::println);

    }
}