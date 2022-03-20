package com.learn.java.chapter7;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static com.learn.java.common.Common.printDivider;

public class AJoiningExample {

    public static void main(String[] args) {

        String result = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println(result);

        printDivider();
        Long count = StudentDataBase.getAllStudents().stream()
                .filter(p -> p.getGpa() > 3.7)
                .collect(Collectors.counting());
        System.out.println(count);


        printDivider();
        count = StudentDataBase.getAllStudents().stream()
                .filter(p -> p.getGpa() > 3.7).count();
        System.out.println(count);


        printDivider();
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList())));//map is preferred approach, this is done just for PoC

        printDivider();
        System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList()));
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName, Collectors.toList())));

        printDivider();
        Optional<Student> result1 = StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        System.out.println(result1);

        printDivider();
        Optional<Student> result2 = StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
        System.out.println(result2);


        printDivider();
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getGradeLevel)));

        printDivider();
        System.out.println(StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getGradeLevel)));







    }
}