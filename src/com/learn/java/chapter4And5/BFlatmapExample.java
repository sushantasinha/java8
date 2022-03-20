package com.learn.java.chapter4And5;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static com.learn.java.common.Common.printDivider;

public class BFlatmapExample {

    public static void main(String[] args) {
        List<String> list =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(list);

        printDivider();

        List<String> list1 =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream)
                .sorted()//natural sort
                .collect(Collectors.toList());
        System.out.println(list1);


    }
}