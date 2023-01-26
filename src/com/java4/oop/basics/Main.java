package com.java4.oop.basics;

import java.util.Scanner;

public class Main {
    int x;
    public static void main(String[] args) {
        SuperHero supermanObject = new SuperHero(656 , "Fly"  , "Clark Kent");
        supermanObject.printData();
        supermanObject.setAge(300);
        System.out.println(supermanObject.getAge());

       /* Car car = new Car();
        System.out.println(car.getSpeed());
        car.setSpeed(1);
        System.out.println(car.getSpeed());

        car.setColor("Red");
        System.out.println(car.getColor());

        car.convertSpeed();*/

        /*Shape shape = new Shape();
        shape.l = 10;
        shape.w = 50;
        shape.area();
        Shape shape1 = new Shape(10,50,"Sq");
        shape1.area();*/
       /* Animal animal = new Animal();
        animal.sound();

        Animal animal1 = new Animal("Locy" , "Cat" );
        animal1.sound();*/



       // PersonA p1 = new PersonA();

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter age ");
        p1.age = scanner.nextInt();

        System.out.println("Plz enter First Name");
        p1.firstName =scanner.next();

        System.out.println("Plz enter Last Name");
        p1.lastName = scanner.next();

*//*
        p1.printData();

        PersonA p2 = new PersonA();
        System.out.println(p2.age);

        System.out.println(p1.age);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter age ");
        int age = scanner.nextInt();

        System.out.println("Plz enter First Name");
        String fname =scanner.next();

        System.out.println("Plz enter Last Name");
        String lastname = scanner.next();

        PersonA p3 = new PersonA(age , fname , lastname);
        p3.printData();*/
        /*Person obj1 = new Person();
        System.out.println(obj1.name);
        obj1.name = "Anis";
        System.out.println(obj1.name);


        Person obj2 = new Person();

        System.out.println(obj2.name);*/
    }
}
