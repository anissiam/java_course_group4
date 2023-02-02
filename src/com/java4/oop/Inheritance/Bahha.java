package com.java4.oop.Inheritance;

public class Bahha extends TestData{
    public Bahha(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println(name);

    }

    @Override
    public void print() {
        System.out.println("HIIIIIIIII");
    }

    @Override
    public void print1() {
        System.out.println("Hello");

    }
}
