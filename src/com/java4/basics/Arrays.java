package com.java4.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        /*String[] names = {"Ali", "sami", "bahaa", "alaa", "mohammed" , "Ali"};
        String name ="";
        for (int i = 0; i<names.length; i++){
           if(name.equalsIgnoreCase(names[i])){
               System.out.println(name + " is found");
           }
            name = names[i];
        }*/

       /* int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);
        int fact = 1 ;
        int sum = 0;
        int i = 0;
        for (; i < nums.length; i++){
            System.out.println("Plz enter value");
            nums[i] = scanner.nextInt();
            fact *= nums[i];
            sum += nums[i];

        }
        System.out.println("Ava " + sum / i);
        System.out.println("fact " + fact);
*/
       /* int[][] bahaa = new int[3][4];
        int[][] x = {{3, 4, 9}, {8, 9, 7 , 5 }, {9, 5, 4}};

        for (int i = 0 ; i<x.length;i++){
            for (int j = 0; j < x[i].length; j++) {

                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
*/

       /* System.out.println(bahaa.length);
        System.out.println(bahaa[0].length);
        System.out.println(bahaa[0][0]);
        bahaa[0][0] = 5;
        System.out.println(bahaa[0][0]);*/



        /*String names1[] = {"Ali", "Sami", "Soso", "toto" , "Yazan"};
        String names2[] = {"Foad", "Yazan", "Soso", "fofo"};

        for (int i = 0 ; i<names1.length;i++){
            //names1[0] => "ALI"  ---i
            for(int j=0 ; j<names2.length; j++){
                //names2[0] => "Foad"  ---j
                if(names1[i].equals(names2[j])){
                    if(names1[i].equals("Soso")){
                        System.out.println(names1[i] + " Found");

                        break;
                    }
                    //System.out.println(names1[i] + " Found");
                }
            }
        }*/




        /*int myNums[] = {10, 50, 8, 2, 90};

        int sum = 0;
        int max = myNums[0];
        int min = myNums[0];
        for(int i = 0 ; i<myNums.length;i++){
            sum = sum + myNums[i];
            if(max<myNums[i]){
                max = myNums[i];
            }
            if(min>myNums[i]){
                min = myNums[i];
            }
            if(myNums[i]==8){
                System.out.println("Found");
            }
        }

        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Sum is " +  sum);*/

        /*Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter name");
            names[i] = scanner.nextLine();
            if (names[i].equalsIgnoreCase("Stop")){
                System.out.println("Stop");
                break;
            }
        }*/




        /*int myNums[] = new int[5];

        for(int i = 0 ; i<myNums.length;i++){
            System.out.println("Plz enter num ");
            myNums[i] = scanner.nextInt();
        }

        for (int x: myNums) {
            System.out.print(x + "  ");

        }
*/

       /* double[] xx = new double[5];
        for (int i = 0; i < xx.length; i++) {
            xx[i] = scanner.nextDouble();
        }*/

        /*Scanner input = new Scanner(System.in);
        double myarry[] = new double[5];
        for (double i = 0; i < myarry.length; i++) {
            System.out.println("ples enter avalue");
            i = input.nextDouble();
        }*/


//        for (int x : myNums) {
//            if(x%2==0){
//                System.out.println(x + " is even" );
//            }else {
//                System.out.println(x + " is Odd" );
//            }
//        }



      /*  String[] names = {"Ali", "sami", "bahaa", "alaa", "mohammed"};
        System.out.println(names[2]);*/

        /*for(int i = 0 ; i <names.length; i++){
           if(names[i].equals("alaa")){
               System.out.println("Found in " + i);
           }
        }*/
        /*int count = 0;
        for (String name : names) {
            if (name.equals("bahaa")) {
                System.out.println(name + " count " + count);
            }
            count++;
        }
*/
        /*double myDouble[] = {2.0, 30.0, 55.2, 66.1 , 3.1};
        System.out.println(myDouble.length);
        for(int i = 0 ;i<myDouble.length ; i++){
            System.out.println(myDouble[i]);
        }

*/


       /* int myNums[] = new int[10];
        System.out.println(myNums.length);
        System.out.println(myNums[0]);
        //System.out.println(myNums[10]);
        //System.out.println(myNums[-1]);
        System.out.println("Done");
        myNums[0] = 5;
        System.out.println(myNums[0]);

        myNums[2] = myNums[0];

        System.out.println(myNums[2]);

        for(int i = 0 ;i<myNums.length ; i++){
            System.out.println(myNums[i]);
        }*/



        /*for(int i = 0 ; i<10; i++){
            System.out.println(myNums[i]);
        }*/
    }
}
