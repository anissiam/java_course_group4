package com.java4.basics;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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


        System.out.println("Plz enter sentence");
        String sentence = input.nextLine();

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
        if(!sentence.isEmpty() || sentence.contains("java")){
            System.out.println("not empty maybe contains java ");
        }else {
            System.out.println("NO");
        }

        System.out.println("Done");
    }
}
