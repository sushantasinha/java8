package com.learn.java.chapter10;

interface Interface1{
    default void fun1() {
        System.out.println("Interface1:fun1");
    }

    /*default void fun() {
        System.out.println("Interface1:fun");
    }*/
}

interface Interface2{
    default void fun2() {
        System.out.println("Interface2:fun2");
    }

    /*default void fun() {
        System.out.println("Interface2:fun");
    }*/
}

interface Interface3{
    default void fun3() {
        System.out.println("Interface3:fun3");
    }

    /*default void fun() {
        System.out.println("Interface2:fun");
    }*/
}

class FDefaultMethod6Example implements Interface1, Interface2, Interface3 {

    /*public void fun() {
        System.out.println("Interface3:fun3");
    }*/

    public static void main(String[] args) {
        FDefaultMethod6Example implClass = new FDefaultMethod6Example();
        implClass.fun1();
        implClass.fun2();
        implClass.fun3();

    }

    //If we uncomment all fun() in interfaces, will have compilation issue. To resolve it, need to impl. this method in impl. class i.e. in FDefaultMethod6Example class
}
