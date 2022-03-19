package com.learn.java.chapter1;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

import static com.learn.java.common.Common.printDivider;

public class LSupplierOperatorExample {

    public static void main(String[] args) {
        Supplier<Student> supplier = () -> StudentDataBase.getAllStudents().get(0);
        System.out.println(supplier.get());
    }
}