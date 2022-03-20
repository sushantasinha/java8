package com.learn.java.chapter7;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.learn.java.common.Common.printDivider;

public class BGroupByExample {

    public static void main(String[] args) {
        Map<String, List<Student>> s = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));
        System.out.println(s);

        printDivider();

        Map<String, List<Student>> s1 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING": "AVERAGE"));
        System.out.println(s1);

        printDivider();

        //TWO LEVEL GROUPING
        //TWO ARG VERSION OF GROUPING BY
        Map<String, Map<String, List<Student>>> s2 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                            Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING": "AVERAGE")));
        System.out.println(s2);

        printDivider();

        Map<String, Integer> s3 = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender,
                            Collectors.summingInt(Student::getGradeLevel)));
        System.out.println(s3);


        //THREE ARG VERSION OF GROUPING BY
        //TWO ARG VERSION OF GROUP BY CALLED INTERNALLY THREE ARG VERSION OF GROUPING BY
        //Not writing any example

    }
}