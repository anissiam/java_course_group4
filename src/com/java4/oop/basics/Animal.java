package com.java4.oop.basics;

public class Animal {

    String name;
    String type;

    public Animal() {
        printData();
    }

    public Animal(String name, String type) {
        this.type = type;
        this.name = name;
        printData();
    }

    public void sound() {
        if(type==null || type.isEmpty()){
            System.out.println("Type is null OR Empty");
            return;
        }

        if (type.equalsIgnoreCase("Cat")) {
            System.out.println("Meowwwww");
        } else {
            System.out.println("Woof Woof ");
        }
    }

    public void printData() {
        System.out.println("Name " + this.name + " Type " + this.type);
    }

}
