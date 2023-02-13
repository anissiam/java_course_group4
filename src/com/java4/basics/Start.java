package com.java4.basics;

public class Start {
    public static void main(String[] args) {
       System.out.println("Hello world!");
        make(10, 10);
        make("10","10");
    }

    public static void make(int x  , int y){
        System.out.println(x + y);
    }

    public static void make(String x, String y) {

        System.out.println(x + y);
    }
}
