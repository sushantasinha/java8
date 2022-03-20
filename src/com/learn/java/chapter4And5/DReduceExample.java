package com.learn.java.chapter4And5;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Optional;

import static com.learn.java.common.Common.printDivider;

public class DReduceExample {

    public static void main(String[] args) {
        //BinaryOperator<Double> bo = (a, b) -> a + b;
        //BinaryOperator<Double> bo = Double::sum;
        Double sumGpa =  StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                .reduce(0.0, Double::sum);
        System.out.println(sumGpa);

        printDivider();

        Double mulGpa =  StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                //IMP: th 1st Param is the initial value not default value
                //So, while multiplication if we pass it as 0.0, entire result will be 0.0
                .reduce(1.0, (a, b) -> a * b);
        System.out.println(mulGpa);

        printDivider();

        Double mulGpa2 =  StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                //IMP: th 1st Param is the initial value not default value
                //So, while multiplication if we pass it as 0.0, entire result will be 0.0
                .reduce(0.0, (a, b) -> a * b);
        System.out.println(mulGpa2);

        printDivider();

        Optional<Double> mulGpa3 =  StudentDataBase.getAllStudents().stream()
                .map(Student::getGpa)
                .reduce( (a, b) -> a * b); //as we did not provide the initial value, so it could be null, so Optional is introduced.
        System.out.println(mulGpa2);

    }
}