package com.learn.java.chapter4;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.Function;
import java.util.function.Supplier;

public class AStreamExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = Student::new;
        System.out.println(studentSupplier.get());

        Function<String, Student> studentFunction = Student::new;
        System.out.println(studentFunction.apply("ABC"));



    }
}