package com.learn.java.chapter10;

interface I1{
    void fun();
}

interface I2{
    void fun();
}

class Impl implements I1, I2 {

    @Override
    public void fun() {
        System.out.println("Hi...");
    }
}

public class EDefaultMethod5Example {
    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.fun();

    }
}