package com.java4.oop.basics;

public class Shape {
    int l ;
    int w;
    String name;

    public Shape() {
    }

    public Shape(int l, int w, String name) {
        this.l = l;
        this.w = w;
        this.name = name;
    }
    public void area(){
        System.out.println(this.l * this.w);
    }
}
