package com.java4.oop.basics;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
       /* int[] array = {10, 50, 60, 80};
        printArray0(array);
        String name = "anis";
        printArray2(array,name);
        getMax(array);*/
        /*System.out.println( getSum());
        System.out.println( getSub());*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter x ");
        int x = scanner.nextInt();
        System.out.println("plz enter y ");
        int y = scanner.nextInt();

        System.out.println("1.Sum\n2.Sub\n3.Div\n4.Mult");

        int c;
        c = scanner.nextInt();
        switch (c) {
            case 1:
                System.out.println(getSum0(x, y));
                break;
            case 2:
                System.out.println(getSub0(x, y));
                break;
            case 3:
                getDiv(x, y);
                break;
            case 4:
                getMulti(x, y);
                break;
            default:
                System.out.println("Not valid");

        }*/

      /*  int ava = getSum() / 2;
        System.out.println(ava);*/

      /*  printArray();
        printArray1();
*/

        add();
        add(10, 10);
        add("10", "10");

        add("asdasd", 10, 20.5);

       /* int[] array = {10, 50, 60, 80};
        for (int x  :array){
            System.out.println(x);
        }

        int[] array1= {10, 50, 60, 80};
        for (int x  :array1){
            System.out.println(x);
        }*/

        // int x =  sum1();
        // System.out.println(sum1());
        //System.out.println(concat1());

        /*sum();
        sub();*/


    }

    public static void add(int x , int y){
        System.out.println(x + y);
    }
    public static void add(String n1 , String n2){
        System.out.println(n1 + n2);
    }

    public static void add(String n1, int n2, double z) {

        System.out.println(n1 + n2);
    }
    public static void add(){
        System.out.println("Empty");
    }


    private static void getMulti(int x, int y) {
        System.out.println(x * y);
    }

    private static void getDiv(int x, int y) {
        if (y == 0) {
            System.out.println("not valid");

        } else {
            System.out.println(x / y);
        }

    }

    public static int getSum0(int x, int y) {

        int z = x + y;
        return z;
    }

    public static int getSub0(int x, int y) {

        int z = x - y;
        return z;
    }

    public static int getSum() {
        int x = 10;
        int y = 50;
        int z = x + y;
        return z;
    }

    public static int getSub() {
        int x = 10;
        int y = 50;
        int z = x - y;
        return z;
    }


    public static void getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);

    }

    public static void printArray0(int[] array) {
        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void printArray2(int[] array, String name) {
        System.out.println(name);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void printArray() {
        int[] array = {10, 50, 60, 80};
        for (int x : array) {
            System.out.println(x);
        }

    }

    public static void printArray1() {
        int[] array = {10, 50, 60, 80};
        for (int x : array) {
            System.out.println(x);
        }

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
