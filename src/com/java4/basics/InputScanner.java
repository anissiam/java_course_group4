package com.java4.basics;


import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        //Homework
        Scanner in = new Scanner(System.in);
        /*1.
        System.out.println("Plz enter number from 4 digit");
        String number = in.nextLine();///// انتظر منك رقم من اربع خانات
        System.out.println(number.charAt(0));
        System.out.println(number.charAt(1));
        System.out.println(number.charAt(2));
        System.out.println(number.charAt(3));*/


        /*
        2-
         */

       /* System.out.println("Plz enter first sanc.");
        String first = in.nextLine();
        System.out.println("Plz enter sec. santance");
        String sec = in.nextLine();

        System.out.println(first.length());
        System.out.println(sec.length());*/


        /*
        4.
         */


        System.out.println("plz enter no1 ");
        int x = in.nextInt();

        System.out.println("plz enter no1 ");
        int y = in.nextInt();

        System.out.println("plz enter no1 ");
        int z = in.nextInt();

        System.out.println("plz enter no1 ");
        int w = in.nextInt();

        int result = (x + y + w + z) / 4;
        System.out.println(result);



/*
        Scanner input = new Scanner(System.in); // جهزت الاداة
        System.out.println("Plz enter your name");
        String name = input.nextLine();
        System.out.println(name);

        System.out.println("Plz enter value");
        int x = input.nextInt();// انتظر من المستخدم ادخال قمية نوعها عدد صحيح ووضعها x

        System.out.println("Plz enter double value");
        double y = input.nextDouble();

        double z = x + y;
        System.out.println(z);*/



       /* int x = 5;
        System.out.println(x);*/


    }
}
