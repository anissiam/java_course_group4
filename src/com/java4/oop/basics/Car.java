package com.java4.oop.basics;

public class Car {
    private int speed;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int speed, String model, String color) {
        this.speed = speed;
        this.model = model;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void convertSpeed(){
        double value = speed * 0.621;
        System.out.println(value + " Mile");
    }

}
