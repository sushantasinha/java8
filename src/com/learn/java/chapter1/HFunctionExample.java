package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.function.BiPredicate;
import java.util.function.Function;

import static com.learn.java.common.Common.printDivider;

public class HFunctionExample {

    public static void main(String[] args) {
        //Student type is INPUT and String type is OUTPUT
        Function<Student, String> f1 = student -> student.getName().toUpperCase() + ": " + student.getGender().toUpperCase();
        //String type is INPUT and String type is OUTPUT
        Function<String, String> f2 = student -> "Name: " + student; //IMP::: Generic type is <String, String> NOT <Student, String>
        StudentDataBase.getAllStudents().forEach(student ->  System.out.println(f1.apply(student)));
        printDivider();
        StudentDataBase.getAllStudents().forEach(student ->  System.out.println(f1.andThen(f2).apply(student)));//Output of f1 is String (<Student, String>), so the input of f2 would be String (<String, String>) i.e. output of f1 would be the input of f2
        //So, for above line student (type Student i.e. apply(student)) is applied to f1 (<Student, String>), whose output is String
        //Output of f1 (String) is applied to f2 <String, String>
    }

}
