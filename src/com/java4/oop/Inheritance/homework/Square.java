package com.java4.oop.Inheritance.homework;

public class Square extends Shape {
    public Square() {
    }

    public Square(int w, int hSquare) {
        super(w, hSquare);
    }

    public void area() {
        System.out.println("Area:" + getW() * getH());
    }

    public void peri() {
        System.out.println("peri" + getW() * 4);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
