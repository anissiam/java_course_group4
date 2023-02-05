package com.java4.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan("Tony stark", (byte) 40, 180);
        ironMan.fly();
        ironMan.speed();
        System.out.println(ironMan.value());
        System.out.println(ironMan.toString());
        System.out.println("=====================================================");

        SuperMan superMan = new SuperMan("Clark ", (byte) 50, 180);
        System.out.println(superMan.toString());
        superMan.fly();
        superMan.speed();

        System.out.println("=====================================================");
        Mars mars = new Mars("Mars", (byte) 50, 80);
        mars.color();
        mars.fly();
        mars.speed();
        System.out.println(mars.laser());
        System.out.println(mars.toString());

    }
}
