package com.learn.java.chapter4And5;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

public class IFindMethodsExample {

    public static void main(String[] args) {

        //THis will search, as soon as it finds a matching record through filter(), will return it, will not traverse others
        Optional<Student> a = StudentDataBase.getAllStudents().stream()
                .filter(p -> p.getGpa() > 3)
                .findAny();

        System.out.println(a);

        //This will search, as soon as it finds a matching record through filter(), will return it
        Optional<Student> b = StudentDataBase.getAllStudents().stream()
                .filter(p -> p.getGpa() > 3)
                .findFirst();

        System.out.println(b);

    }
}