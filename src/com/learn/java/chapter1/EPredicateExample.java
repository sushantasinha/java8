package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.Predicate;

import static com.learn.java.common.Common.printDivider;

public class EPredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = p -> p % 2 == 0;
        Predicate<Integer> predicate2 = p -> p % 4 == 0;
        System.out.println(predicate.test(6));
        System.out.println(predicate.test(3));
        printDivider();
        System.out.println(predicate.and(predicate2).test(6));//chaining of predicate
        System.out.println(predicate.and(predicate2).test(4));
        printDivider();
        System.out.println(predicate.or(predicate2).test(6));//chaining of predicate
        System.out.println(predicate.or(predicate2).test(4));
        printDivider();
        System.out.println(predicate.or(predicate2).negate().test(6));//chaining of predicate
        System.out.println(predicate.or(predicate2).negate().test(4));
        printDivider();
        studentExample();
        printDivider();
        studentExampleAnother();

    }

    private static void studentExample() {
        Predicate<Student> predicate = p -> p.getGradeLevel() >= 3;
        StudentDataBase.getAllStudents().forEach(student -> {
            if(predicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    private static void studentExampleAnother() {
        StudentDataBase.getAllStudents().forEach(student -> {
            if(student.getGradeLevel() >= 3) {
                System.out.println(student);
            }
        });
    }


}
