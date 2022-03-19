package com.learn.java.chapter2And3;

import java.util.function.Function;

public class AMethodRefExample {

    public static void main(String[] args) {
        Function<String, String> f1 = String::toUpperCase;
        System.out.println(f1.apply("Hello"));
    }
}