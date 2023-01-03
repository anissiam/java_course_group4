package com.java4.basics;


import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // جهزت الاداة
        System.out.println("Plz enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Plz enter value");
        int x = input.nextInt();// انتظر من المستخدم ادخال قمية نوعها عدد صحيح ووضعها x

        System.out.println("Plz enter double value");
        double y = input.nextDouble();

        double z = x + y;
        System.out.println(z);





       /* int x = 5;
        System.out.println(x);*/



    }
}
