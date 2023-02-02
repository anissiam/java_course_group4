package com.java4.oop.Inheritance;

public  abstract class TestData {
    String name;

    public TestData(String name) {
        this.name = name;
    }

    public abstract void printName();

    public abstract void print();
    public abstract void print1();
    public void test(){
        System.out.println("TEST");
    }
}
