package com.learn.java.chapter2;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.Function;
import java.util.function.Supplier;

public class AMethodRefExample {

    public static void main(String[] args) {
        Function<String, String> f1 = String::toUpperCase;
        System.out.println(f1.apply("Hello"));
    }
}