package com.learn.java.chapter10;

import java.util.*;
import java.util.stream.Collectors;

public class ADefaultMethod1Example {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("zz", "dfd", "rfrf");
        //Prior Java 8
        Collections.sort(list);
        System.out.println(list);
        //Java8
        list = Arrays.asList("zz", "dfd", "rfrf");
        list.sort(Comparator.naturalOrder()); //default method
        System.out.println(list);
        list.sort(Comparator.reverseOrder()); //default method
        System.out.println(list);

    }
}


