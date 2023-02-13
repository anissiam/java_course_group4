package com.java4.oop.basics;

import java.util.ArrayList;

public class WappingClassess {
    public static void main(String[] args) {
        ArrayList<Car> aaa = new ArrayList<Car>();
        int x = 10; // pr
        System.out.println(x);
        Integer xx = 10; //object
        System.out.println(xx.doubleValue());
        Integer yy = new Integer("10");
        System.out.println(yy);
        try {
            Integer yy1 = new Integer("anis");
            System.out.println(yy1);
        }catch (NumberFormatException e){
            System.out.println("Plz enter number not letter");
        }

        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(10, 50));
        System.out.println(Integer.sum(10, 50));
        System.out.println(Integer.compare(10, 10));
        Integer x1 = Integer.valueOf("10"); // Pr --> Object
        int qq = Integer.parseInt("10");//Object --> pr
        System.out.println(qq);
        System.out.println(x1);




    }
}
