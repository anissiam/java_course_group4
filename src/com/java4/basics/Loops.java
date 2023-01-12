package com.java4.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Plz enter num");
        int num = scanner.nextInt();*/
        int num;
        int max = 0;
        int min = 0;
        for (int i = 0; i < 9; i++) {
            System.out.println("Enter new num ");
            num = scanner.nextInt();

            if(i == 0 ){
                max = num;
                min = num;
            }
            if(max <num){
                max = num;
            }

            if(min > num){
                min = num;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);

        /*int sum = 0;
        for(int i = 0;i<5;i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum : "  +  sum);*/

        /*int i = 5;
        while (i< 5){
                System.out.println(++i);
        }*/

        /*int i = 5;
        do {
            System.out.println(++i);
        } while (i < 5);*/




      /*  int i = 1;
        int fact = 1;

        while (i <= 7) {
            System.out.println(i);

            fact = fact * i;
            i++;
        }

        System.out.println(fact);*/
        /*Scanner in = new Scanner(System.in);

        int i = 1, num ,sum = 0;
        while (i<=5){
            System.out.println("Plz enter num " + i);
            num = in.nextInt();
            i++;
            sum+= num;
        }
        System.out.println(sum/(i-1));*/


        //i
//        System.out.println("Hello");//1
//        System.out.println("Hello");//2
//        System.out.println("Hello");//3
//        System.out.println("Hello");//4
//        System.out.println("Hello");//5


       /* int i = 1;
        while (i<=5){
            System.out.println(i);
            i++;
        }*/

        /*int i = 0;
        while (i<=10){
            if(i%2!=0){
                System.out.print(i+ " ");
            }
            i++;
        }*/

        /*int i = 1;
        while (i<=10){
            System.out.print(i+ " ");
            i += 2;
        }*/
        /*int i = 0;
        while (i<=10){
            if(i==5){
                break;
            }

            System.out.print(i+ " ");
            i++;
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter name ");
        String name = scanner.nextLine();

        while (true){
            if(name.equalsIgnoreCase("Stop")){
                System.out.println("App stopped");
                break;
            }
            System.out.println(name);
            System.out.println("Plz enter new name");
            name = scanner.nextLine();
        }*/

        // اختصار للكود الذي اعلى
        /*while (!name.equalsIgnoreCase("Stop")){
            System.out.println(name);
            System.out.println("Plz enter new name");
            name = scanner.nextLine();
        }*/

        /*int i = 0;
        while (i <= 10) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
            i++;
        }*/



       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter number");
        int num = scanner.nextInt();

        int i = 0;
        while (i <= num) {
            *//*System.out.print(i + "  ");
            i++;
            *//*
            System.out.print(++i + " ");
        }*/


       /* int i = 0;
        while (i <= num) {

//            if (i % 2 == 0) {
//
//            }

            System.out.print(i + "  ");
            i+=2;
        }*/

    }
}
