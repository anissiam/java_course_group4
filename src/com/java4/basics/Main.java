package com.java4.basics;

public class Main {
    static int x = 10; //Global Variables
    static int q;
    static double i;

    public static void main(String[] args) {

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result = result - 1; // result is now 2  ///
        System.out.println(result);

        result = result * 2; // result is now 4
        System.out.println(result);

        result = result / 2; // result is now 2
        System.out.println(result);

        result = result + 8; // result is now 10
        result = result % 7; // result is now 3
        System.out.println(result);

        byte fristNo = 10;
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        System.out.println(myNum + " " + myFloatNum + " " + myLetter + " " + myBool);

        int x = 5;
        int y = 6;

        int z = x * y++;
        //    = 5 *( 1.get y 2. y=y+1)
        //    = 5 * 6
        // output Z = 30
        //Ram x = 5  , y = 6 - 7
        System.out.println(z);

        z = ++x * ++y;
        // (1.x =x+1 2.get x ) * (1.y=y+1 2.get y )
        //  6 * 8 = 48
        //Ram x = 5-6  , y = 6 - 7 - 8

        System.out.println(z);




       /* int x = 10;
        int y = 50;
        int w = 30;
        System.out.println(x+y+ w);  //

        int z = x + y + w;
        System.out.println(z);

        int ava = z / 3;
        System.out.println(ava);

        System.out.println(ava - 10);

        int ava1 = (x + y + w) / 3;
        System.out.println(ava1);


        double dd = 10.3212341;
        double vv = 10;
        int cc = 200;
        vv = cc;
        System.out.println( "CC "+ cc);
        System.out.println(dd + vv);


        int zz =(int) dd;
        System.out.println(zz);
        float bbb = 100.0f;
        double qqq = (double) bbb;

        long rrr = 100L;

        int ooo = (int) rrr;

        System.out.println(10%2);

        System.out.println(z + 10);
        //z = z + 10;
        z += 10;
        System.out.println(z);
*/

       /* int y = 50;//Local  Variables
        // System.out.println(y);

        y = 20;
        System.out.println(y);

        int x = 20;
        //int y = 50; In Correct

        byte z = -128;

        double ww = 5.5; // Var
        System.out.println("Value is [" + ww+"]");
        System.out.println("ww = [" + ww+"]");
        float ff =(float) 50.5;
        float ff1 = 50.5F;
        System.out.println(ff);
        //long ll = 10L;


        boolean bool = true;
        System.out.println(bool);

        char ch0 = 'A';
        char ch1 = 'N';
        char ch2 = 'I';
        char ch3 = 'S';
        System.out.println((byte)ch0);
        System.out.println((char) 65);
        System.out.print("My name is Anis my age ");
        System.out.println(29);*/

    }
}