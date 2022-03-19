package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.learn.java.common.Common.printDivider;

public class FPredicateAndConsumerExample {

    public static void main(String[] args) {

        //Approach 1
        Consumer<Student> studentConsumer = student -> {
            Predicate<Student> studentPredicate = predicate -> predicate.getGradeLevel() >= 3;
            if(studentPredicate.test(student)) {
                System.out.println(student);
            }
        };
        StudentDataBase.getAllStudents().forEach(student -> studentConsumer.accept(student));

        printDivider();
        //Approach 2
        StudentDataBase.getAllStudents().forEach(student -> {
            Predicate<Student> studentPredicate = predicate -> predicate.getGradeLevel() >= 3;//I know this can be avoided here, as shown in approach 3, but used here to show the use case of predicate with consumer
            if(studentPredicate.test(student)) {
                System.out.println(student);
            }
        });


        printDivider();
        //Approach 3
        StudentDataBase.getAllStudents().forEach(student -> {
            if(student.getGradeLevel() >= 3) {
                System.out.println(student);
            }
        });


    }

}
