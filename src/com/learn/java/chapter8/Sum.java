package com.learn.java.chapter8;

class Sum {
    private int total; //mutable variable

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input) {
        total += input;
    }

}