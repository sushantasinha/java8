package com.learn.java.chapter1;

import com.learn.java.common.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

import static com.learn.java.common.Common.printDivider;

public class DBiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> multiplicationBiConsumer = (a, b) -> System.out.println("Multiplication is:  " + a * b);//Method definition i.e. accept() method
        BiConsumer<Integer, Integer> divisionBiConsumer = (a, b) -> {
            System.out.println("Division is:  " + a / b);
        };

        //One
        multiplicationBiConsumer.accept(4, 2);//calling method

        //Two
        printDivider();
        multiplicationBiConsumer.andThen(divisionBiConsumer).accept(4, 2);

        //Three
        printDivider();
        printNameAndActivities();
    }

    private static void printNameAndActivities() {
        BiConsumer<String, List<String>> b = (name, activities) -> System.out.println("name: " + name + " activities" + activities);
        StudentDataBase.getAllStudents().forEach(student -> b.accept(student.getName(), student.getActivities()));
    }


}
