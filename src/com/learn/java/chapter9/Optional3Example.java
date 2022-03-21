package com.learn.java.chapter9;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

import static com.learn.java.common.Common.printDivider;

public class Optional3Example {

    public static void main(String[] args) {

        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //isPresent
        if(optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get().getName());
        } else {
            System.out.println("NOT PRESENT");
        }

        printDivider();

        //ifPresent
        optionalStudent.ifPresent(s -> System.out.println(s.getName()));

    }


}
