package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class JUnaryOperatorExample {

    public static void main(String[] args) {
        UnaryOperator<String> stringUnaryOperator = s -> s.toUpperCase(); //<String> -> For input and output
        System.out.println(stringUnaryOperator.apply("Hello World!"));
    }

}