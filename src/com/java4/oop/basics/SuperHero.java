package com.java4.oop.basics;

public class SuperHero {
    private int age;
    private String power;
    private String name;

    public SuperHero() {
    }

    public SuperHero(int age, String power, String name) {
        this.age = age;
        this.power = power;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printData(){
        System.out.println("Name " + name + " Age " + age + "  Power " + power);
    }
}
