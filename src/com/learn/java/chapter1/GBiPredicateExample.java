package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GBiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<Integer, Double> biPredicate = (gpaLevel, gpa) -> gpaLevel >= 3 && gpa >=3.9;
        StudentDataBase.getAllStudents().forEach(student -> {
            if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
                System.out.println(student);
            }
        });


    }

}
