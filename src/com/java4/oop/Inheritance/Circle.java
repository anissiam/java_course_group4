package com.java4.oop.Inheritance;

public class Circle extends Shape{
    public Circle(String name, int rad) {
        super(name, rad);
    }

    @Override
    public void area() {
        System.out.println(2 * Math.PI * Math.pow(getRad(), 2));
    }
}
