package com.java4.oop.basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // int x =  sum1();
       // System.out.println(sum1());
        System.out.println(concat1());

        /*sum();
        sub();*/
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter x ");
        int x = scanner.nextInt();
        System.out.println("plz enter y ");

        int y = scanner.nextInt();

        int z = x + y;
        System.out.println(z);
    }

    public static int sum1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter x ");
        int x = scanner.nextInt();
        System.out.println("plz enter y ");

        int y = scanner.nextInt();

        int z = x + y;

        return z;
    }

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter x ");
        int x = scanner.nextInt();
        System.out.println("plz enter y ");

        int y = scanner.nextInt();

        int z = x - y;
        System.out.println(z);
    }

    public static void concat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter name1 ");
        String x = scanner.nextLine();

        System.out.println("plz enter name 2  ");

        String y = scanner.nextLine();

        System.out.println(x.concat(" " + y));
    }
    public static String concat1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter name1 ");
        String x = scanner.nextLine();

        System.out.println("plz enter name 2  ");

        String y = scanner.nextLine();
        String ccc = x.concat(" " + y);
        return ccc;
    }


}
