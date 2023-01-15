package com.java4.basics;

public class Arrays {
    public static void main(String[] args) {

        String[] names = {"Ali", "sami", "bahaa", "alaa", "mohammed"};
        System.out.println(names[2]);

        for(int i = 0 ; i <names.length; i++){
           if(names[i].equals("alaa")){
               System.out.println("Found in " + i);
           }
        }
      /*  for (String name:names) {
            System.out.println(name);

        }*/

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
