package com.java4.basics;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter age");
        int age = input.nextInt(); // 50

        switch (age){
            case 1 : System.out.println("One");
                break;
            case 2 :
            case 3 : System.out.println("2 OR 3"); break;
            default: System.out.println("Not valid"); break;
        }

      /*
        switch (age){
            case 50 :
                System.out.println("كهل");
                break;
            case 20:
                System.out.println("بالغ");
                break;
            case 15 :
                System.out.println("مراهق");
            default:
                System.out.println("غير ذلك ");
                break;
        }
*/

            // T      AND  F  -> F
        /*if (age >= 20 && age<=40) {
            System.out.println("بالغ");
        } else if (age >= 15 && age<20) {
            System.out.println("مراهق");
        } else if(age <15) {
            System.out.println("طفل");
        }else {
            System.out.println("مكهل");
        }
*/
        /*System.out.println("Plz enter Year.");
        int year = input.nextInt();
        if(year>2023){
            System.out.println("بعده مش مخلوق");
            return;
        }
        if(year>2020){
            System.out.println("Baby");
        }else if (year>=2015){
            System.out.println("teenager");
        }else if(year>= 2005){
            System.out.println("راشد");
        }else {
            System.out.println("OLD");
        }*/



       /* int mark = input.nextInt();
        if(mark>=50){
            System.out.println("Passed");
            if(mark>=90){
                System.out.println("Exultant");
            }
        }else {
            System.out.println("Not Passed");
        }*/

        /*int x = 3;

        if (x > 0)
            System.out.println("x is greater than 0");
        else{
    System.out.println ("x is less than or equal 0");
}*/
       /*  System.out.println("Plz enter sentence");
        String sentence = input.nextLine();*/


       /* if(sentence.isEmpty()){
           return;
        }

        if(sentence.contains("@")){
            System.out.println("Email");
        }else {
            System.out.println("URL");
        }*/


        //System.out.println("Plz enter mark");
        //int mark = input.nextInt();
        // == , >= , <= , != , > , <
        //     T
        /*if(mark>=90) {
            System.out.println("Up to 90 ");

        }else {
            System.out.println("less than 90 ");
        }*/


        /*if (mark%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }*/

        /*if(mark>0){
            System.out.println(">0");
            ////////////
            if(mark%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
            ////////////////////////
        }else {
            System.out.println("Less than 0 ");
        }*/


        /*System.out.println("Plz enter sentence");
        String sentence = input.nextLine();*/

       /* if(sentence.length()>0){

            if(sentence.contains("java")){
                System.out.println("yes ");
            }else {
                System.out.println("No");
            }

        }else {
            System.out.println("Empty");
        }*/
        // F  ->T
        /*if(!sentence.isEmpty()){

            if(sentence.contains("java")){
                System.out.println("yes ");
            }else {
                System.out.println("No");
            }

        }else {
            System.out.println("Empty");
        }*/
        //F ->T              AND  T      = T
        /*if(!sentence.isEmpty() && sentence.contains("java")){
            System.out.println("not empty and contains java ");
        }else {
            System.out.println("NO");
        }
*/
        //F ->T                OR  F     = T
       /* if(!sentence.isEmpty() || sentence.contains("java")){
            System.out.println("not empty maybe contains java ");
        }else {
            System.out.println("NO");
        }
*/
        System.out.println("Done");
    }
}
