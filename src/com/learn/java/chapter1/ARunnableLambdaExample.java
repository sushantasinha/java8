package com.learn.java.chapter1;

public class ARunnableLambdaExample {

    public static void main(String[] args) {

        //old java approach
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am in old approach");
            }
        };

        new Thread(runnable).start();

        //new Approach
        Runnable runnable1 = () -> System.out.println("I am in new approach 1");
        new Thread(runnable1).start();

        //new Approach 2
        new Thread(() -> System.out.println("I am in new approach 2")).start();



    }
}
