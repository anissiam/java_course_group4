package com.java4.oop.interfaces;

public class SuperMan extends Person implements SuperHero{
    public SuperMan() {
    }

    public SuperMan(String name, byte age, int tall) {
        super(name, age, tall);
    }

    @Override
    public void fly() {
        System.out.println("FLY Superman");
    }

    @Override
    public void speed() {
        System.out.println("10000000");

    }

    @Override
    public boolean laser() {
        return true;
    }
}
