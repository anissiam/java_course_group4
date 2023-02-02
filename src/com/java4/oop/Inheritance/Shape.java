package com.java4.oop.Inheritance;

public  class Shape {
    private int l ;
    private int w;
    private String name;

    private int rad;
    public Shape() {
    }

    public Shape(String name, int rad) {
        this.name = name;
        this.rad = rad;
    }

    public Shape(int l, int w, String name) {
        this.l = l;
        this.w = w;
        this.name = name;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void area(){
        System.out.println("Area");
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }
}
