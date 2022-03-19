package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

import static com.learn.java.common.Common.printDivider;

public class CConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("java 8");
        //printStudents();
        consumerChainingWithStudents();
    }


    public static void printStudents() {
        Consumer<Student> consumer = student -> System.out.println(student); //OR (student) -> System.out.println(student);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer);

        printDivider();
        //on in 1 line:
        StudentDataBase.getAllStudents().forEach(student -> System.out.println(student));
    }


    public static void consumerChainingWithStudents() {
        printDivider();
        Consumer<Student> c1 = student -> System.out.println(student);//Based on the type of generics, it will define the type of "student"
        Consumer<Student> c2 = student -> System.out.println(student.getActivities());
        StudentDataBase.getAllStudents().forEach(c1.andThen(c2));//multiple chaining possible
    }

}
