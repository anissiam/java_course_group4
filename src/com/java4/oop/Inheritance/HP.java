package com.java4.oop.Inheritance;

import com.java4.oop.basics.Computer;

public class HP extends Computer {
    private int power;
    public HP(int ram, String company, int cpu, String year , int power) {
        super(ram, company, cpu, year);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void hi() {
        //super.hi();
        System.out.println("Hello");
    }
}
