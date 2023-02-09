package com.java4.oop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Ploy1 ploy1 = new Ploy1();
        Add add = new Add();
        ploy1.printTest(add ,10,50);

        Cocat cocat = new Cocat();
        ploy1.printTest(cocat, 10, 50);




        /*A obj = new A();
        //obj.print();
        Poly poly = new Poly();
        poly.printData(obj );




        A obj1= new B();

        poly.printData(obj1 );

        obj1 = new C();
        poly.printData(obj1);*/



    }
}
