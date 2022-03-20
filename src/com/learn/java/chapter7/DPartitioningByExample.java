package com.learn.java.chapter7;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.learn.java.common.Common.printDivider;

public class DPartitioningByExample {

    public static void main(String[] args) {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.2;

        //1 Arg constructor
        Map<Boolean, List<Student>> s1 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println(s1);

        printDivider();

        //2 Arg constructor
        Map<Boolean, Set<Student>> s2 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
        System.out.println(s2);

        //Result is going to be the same for both...with 1 or 2 arg constructor


        
    }
}