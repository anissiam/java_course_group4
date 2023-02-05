package com.java4.oop.interfaces;

public class Mars extends Person implements SuperHero1 {
    public Mars(String name, byte age, int tall) {
        super(name, age, tall);
    }

    @Override
    public void fly() {
        System.out.println("Flyy");
    }

    @Override
    public void speed() {
System.out.println("20020");
    }

    @Override
    public boolean laser() {
        return false;
    }

    @Override
    public void color() {
        System.out.println("Green");
    }
}
