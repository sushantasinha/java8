package com.learn.java.chapter4And5;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static com.learn.java.common.Common.printDivider;

public class JFactoryMethodsExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("zzzz", "cvcvcvc", "lfjdff");
        s.forEach(System.out::println);

        printDivider();

        Stream.iterate(1, x -> x*2)
                .limit(10) //Generate infinite stream, so need to limit
                .forEach(System.out::println);


        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(10)
                .forEach(System.out::println);

    }
}