package com.bobabelga.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create two object from Single Class and the result was =>  Just one object Created and printed data once
        Single single1 = Single.getInstance();
        single1.printData();
        Single single2 = Single.getInstance();
        single2.printData();
    }
}
