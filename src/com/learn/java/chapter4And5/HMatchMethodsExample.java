package com.learn.java.chapter4And5;

import com.learn.java.common.StudentDataBase;

public class HMatchMethodsExample {

    public static void main(String[] args) {
        boolean a = StudentDataBase.getAllStudents().stream().allMatch(p -> p.getGpa() >= 3);
        boolean b = StudentDataBase.getAllStudents().stream().anyMatch(p -> p.getGpa() >= 3);
        boolean c = StudentDataBase.getAllStudents().stream().noneMatch(p -> p.getGpa() >= 3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}