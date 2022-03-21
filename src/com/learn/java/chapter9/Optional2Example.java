package com.learn.java.chapter9;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

import static com.learn.java.common.Common.printDivider;

public class Optional2Example {

    public static void main(String[] args) {

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = optionalStudent.map(Student::getName).orElse("Default");
        System.out.println(name);

        printDivider();
        optionalStudent = Optional.ofNullable(null);
        name = optionalStudent.map(Student::getName).orElse("Default");
        System.out.println(name);

        printDivider();
        optionalStudent = Optional.ofNullable(null);
        name = optionalStudent.map(Student::getName).orElseGet(() -> "SupplierDefault");
        System.out.println(name);

        printDivider();
        optionalStudent = Optional.ofNullable(null);
        name = optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No value present in data"));
        System.out.println(name);



    }


}
