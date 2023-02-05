package com.java4.oop.Inheritance.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter H");
        int h = scanner.nextInt();

        System.out.println("Plz enter W ");
        int w = scanner.nextInt();

        Square square = new Square(w, h);
        System.out.println(square.toString());
        square.area();
        square.peri();

        Triangle triangle = new Triangle(w, h);
        System.out.println(triangle.toString());
        triangle.area();
        triangle.peri();

        System.out.println("Plz enter rad ");
        int rad = scanner.nextInt();
        Cirlce cirlce = new Cirlce();
        cirlce.setRad(rad);
        System.out.println(cirlce.toString());
        cirlce.area();
        cirlce.peri();
        /*square.setH(h);
        square.setW(w);*/

    }
}
