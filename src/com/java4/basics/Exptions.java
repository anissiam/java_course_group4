package com.java4.basics;

import com.java4.oop.basics.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exptions {
    static Car car;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        try {
            //car.getColor();
            int x = scanner.nextInt();
            System.out.println(x/0);
        }catch (InputMismatchException e){
            System.out.println(e);
            return;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e){
            car = new Car();
            System.out.println(car.getColor());
        }finally {
            System.out.println("Finally");
        }

       System.out.println("Done");


    }
}
