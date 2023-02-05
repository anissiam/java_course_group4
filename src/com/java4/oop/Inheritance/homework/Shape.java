package com.java4.oop.Inheritance.homework;

public class Shape {
    private int w;
    private int h;

    public Shape() {
    }

    public Shape(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
