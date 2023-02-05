package com.java4.oop.Inheritance.homework;

public class Triangle extends Shape {
    public Triangle() {
    }

    public Triangle(int w, int h) {
        super(w, h);
    }

    public void area() {
        System.out.println("Area:" + getW() * getH());
    }

    public void peri() {
        System.out.println("peri" + (getH() + getW()) * 2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
