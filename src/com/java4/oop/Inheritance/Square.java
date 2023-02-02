package com.java4.oop.Inheritance;

public class Square extends Shape {
    public Square(int l, int w, String name) {
        super(l, w, name);
    }
    public void area1() {
        area();

        System.out.println(getL() * getW());
    }
    @Override
    public void area() {
        System.out.println(getL() * getW());
    }
}
