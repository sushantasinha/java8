package com.learn.java.chapter1;

import java.util.Comparator;

public class BComparatorLambdaExample {

    public static void main(String[] args) {

        //old java approach
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // o1 == o1 -> returns 0;
                // o1 > o1 -> returns 1;
                // o1 < o1 -> returns -1;
            }
        };

        System.out.println("Result: " + comparator.compare(3, 2));

        //new approach
        //Comparator<Integer> comparatorNew = (Integer i1, Integer i2) ->  i1.compareTo(i2); -> same thing as below line
        Comparator<Integer> comparatorNew = (i1, i2) ->  i1.compareTo(i2);
        System.out.println("Result new: " + comparatorNew.compare(3, 2));

        //new approach 2
        Comparator<Integer> comparatorNew2 = Integer::compareTo;
        System.out.println("Result new: " + comparatorNew2.compare(3, 2));


    }
}
