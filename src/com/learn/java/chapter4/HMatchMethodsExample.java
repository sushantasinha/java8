package com.learn.java.chapter4;

import com.learn.java.common.StudentDataBase;

import java.util.Arrays;
import java.util.List;

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