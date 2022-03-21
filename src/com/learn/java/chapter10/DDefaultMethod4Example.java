package com.learn.java.chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Multiplier {

    public int i = 0;

    void m1();

    default void m2() {
        System.out.println("in Multiplier:m2");
    }

    static void m3() {
        System.out.println("in Multiplier:m3");
    }

}


class MultiplierImpl implements Multiplier {

    @Override
    public void m1() {
        System.out.println("in MultiplierImpl:m1");
    }

    @Override
    public void m2() {
        System.out.println("in MultiplierImpl:m2");
    }

    public void m3() {
        System.out.println("in MultiplierImpl:m3");
    }
}

public class DDefaultMethod4Example {

    public static void main(String[] args) {

        Multiplier mult = new MultiplierImpl();
        mult.m1();
        mult.m2();
        //mult.m3()//NOT POSSIBLE as expected  as it is static method

        Multiplier.m3();
        //MultiplierImpl.m3()//NOT POSSIBLE ***
    }
}


