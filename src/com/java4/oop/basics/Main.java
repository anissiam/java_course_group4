package com.java4.oop.basics;

public class Main {
    int x;
    public static void main(String[] args) {
        Person obj1 = new Person();
        System.out.println(obj1.name);
        obj1.name = "Anis";
        System.out.println(obj1.name);


        Person obj2 = new Person();

        System.out.println(obj2.name);
    }
}
