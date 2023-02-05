package com.java4.oop.interfaces;

public class Person {
    private String name;
    private byte age;
    private int tall;

    public Person() {
    }

    public Person(String name, byte age, int tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public void work() {
        System.out.println("WORK");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                '}';
    }
}
