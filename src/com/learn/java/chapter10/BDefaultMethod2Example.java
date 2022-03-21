package com.learn.java.chapter10;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.learn.java.common.Common.printDivider;

public class BDefaultMethod2Example {

    public static void main(String[] args) {
        //Comparator chaining
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
        List<Student> students = StudentDataBase.getAllStudents();
        students.sort(gradeComparator.thenComparing(nameComparator));
        System.out.println(students);
    }
}


