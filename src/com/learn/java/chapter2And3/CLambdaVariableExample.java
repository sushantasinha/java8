package com.learn.java.chapter2And3;

import java.util.function.Consumer;
import java.util.function.Function;

public class CLambdaVariableExample {

    static int j =0;

    public static void main(String[] args) {

        int i = 0;

        //ONE
        //Won't work
        //Consumer<Integer> c1 = i -> System.out.println(i);

        //TWO
        Consumer<Integer> c1 = i1 -> {
            //int i = 1; //Won't work
            //i++; //Won't work --> effectively final
            j = 3;//WORK, instance variable/class variable will work
            int j = 5;//WORK, instance variable/class variable will work
            System.out.println(i);
            System.out.println(i1);
            System.out.println(j);

        };
        c1.accept(10);
    }
}