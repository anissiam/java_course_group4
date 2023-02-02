package com.java4.oop.Inheritance;

public class Person1 {
    String name ;
    int age;
    int tall;

    int grad;

    public Person1() {
    }

    public Person1(String name, int age, int tall, int grad) {
        this.name = name;
        this.age = age;
        this.tall = tall;
        this.grad = grad;
    }

    public void showData() {
        System.out.println("Person" );
    }


}
