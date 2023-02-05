package com.java4.oop.interfaces;

public class IronMan extends Person implements SuperHero,Money {
    public IronMan() {
    }

    public IronMan(String name, byte age, int tall) {
        super(name, age, tall);
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void speed() {
        System.out.println("10000");
    }

    @Override
    public boolean laser() {
        return false;
    }

    @Override
    public long value() {
        return 10000000000000000L;
    }
}
