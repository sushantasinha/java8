package com.learn.java.chapter1;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static com.learn.java.common.Common.printDivider;

public class KBinaryOperatorExample {

    public static void main(String[] args) {
        BinaryOperator<Integer> integerBinaryOperator = (a, b) -> a * b; //<String> -> For input and output. a and b both are input
        System.out.println(integerBinaryOperator.apply(2, 3));

        printDivider();
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b); // that means comparator is also a BinaryOperator; here 2 input of type Integer and output is also Integer
        BinaryOperator<Integer> maxByBinaryOperator = BinaryOperator.maxBy(comparator);
        System.out.println("Result of maxBy: " + maxByBinaryOperator.apply(4, 5));

        printDivider();
        BinaryOperator<Integer> minByBinaryOperator = BinaryOperator.minBy(comparator);
        System.out.println("Result of minBy: " + minByBinaryOperator.apply(4, 5));



    }

}