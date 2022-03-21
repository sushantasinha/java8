package com.learn.java.chapter9;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

public class Optional1Example {

    public static void main(String[] args) {

        System.out.println(optionalOfNUllable().get());
        System.out.println(optionalOf().get());

    }

    public static Optional<String> optionalOfNUllable() {
        return Optional.ofNullable(null);
    }

    public static Optional<String> optionalOf() {
        return Optional.of(null);//null pointer exception
    }
}
