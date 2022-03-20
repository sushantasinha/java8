package com.learn.java.chapter4And5;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.learn.java.common.Common.printDivider;

public class CStreamComparatorExample {

    public static void main(String[] args) {
        List<Student> list =  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(list);

        printDivider();
        List<Student> list1 =  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())//decending order
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}