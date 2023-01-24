package com.java4.oop.basics;

public class PersonA {
    int age;
    String firstName;
    String lastName;

    public PersonA(){
        System.out.println("Hello");
      /*  for(int i = 0 ; i< 50 ; i++){
            System.out.println(i);
        }*/
    }

   /* public PersonA(int age ){
        this.age = age;
    }*/

    public PersonA(int age ){
        this.age = age;
    }

    public PersonA(int age  , String firstName , String lastName){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public void play(String value){
        System.out.println(value);

    }
    public String eat(){
        return "Banana";
    }

    public void printData(){
        System.out.println("Age = " + this.age + " FName = " + this.firstName + " LName = " + this.lastName
         + " Eat " + this.eat());
        play("Football");

    }


}
