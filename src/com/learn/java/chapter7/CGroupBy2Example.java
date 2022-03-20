package com.learn.java.chapter7;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.learn.java.common.Common.printDivider;

public class CGroupBy2Example {

    public static void main(String[] args) {
        //maxBy
        Map<String, Optional<Student>> s1 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                            Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(s1);

        printDivider();

        //minBy
        Map<String, Optional<Student>> s2 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(s2);

        printDivider();


        //collectingAndThen
        //Check the diff from earlier... where output was with Optional<Student>, here Student
        Map<String, Student> s3 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(s3);

    }
}