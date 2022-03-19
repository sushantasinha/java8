package com.learn.java.chapter4;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

import static com.learn.java.common.Common.printDivider;

public class FReduce3Example {

    public static void main(String[] args) {
        Double highestGpa1 =  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .findFirst()
                .orElseThrow()
                .getGpa();
        System.out.println(highestGpa1);
        printDivider();

        //Approach 2 to get highest GPA
        Double highestGpa2 =  StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa))
                .orElseThrow()
                .getGpa();
        System.out.println(highestGpa2);
        printDivider();

        //Approach 2 to get highest GPA
        Optional<Student> highestGpa3 =  StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1: s2);//avoiding initial value, as we using this to find min/max value
        highestGpa3.ifPresent(student -> System.out.println(student.getGpa()));
        printDivider();

    }
}