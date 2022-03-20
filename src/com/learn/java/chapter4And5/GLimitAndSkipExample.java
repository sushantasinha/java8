package com.learn.java.chapter4And5;

import java.util.Arrays;
import java.util.List;

public class GLimitAndSkipExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6,7,8,9,11);
        System.out.println(list.stream()
                .limit(4) //picked first 4
                .reduce(Integer::sum));

        System.out.println(list.stream()
                .skip(3) //skip first 3
                .reduce(Integer::sum));
    }
}