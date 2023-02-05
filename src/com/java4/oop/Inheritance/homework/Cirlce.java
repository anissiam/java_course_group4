package com.java4.oop.Inheritance.homework;

public class Cirlce extends Shape{
    private int rad;

    public Cirlce(){

    }
    public Cirlce(int rad) {
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void area() {
        System.out.println("Area:" + Math.PI * Math.pow(rad, 2));
    }

    public void peri() {
        System.out.println("peri" + Math.PI * rad * 2);
    }
    @Override
    public String toString() {
        return "Rad " + rad;
    }
}
