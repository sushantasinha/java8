package com.learn.java.chapter4;

import com.learn.java.common.Student;
import com.learn.java.common.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static com.learn.java.common.Common.printDivider;

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