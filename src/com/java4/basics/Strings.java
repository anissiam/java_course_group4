package com.java4.basics;

public class Strings {
    public static void main(String[] args) {
        String name = "Anis";
        String name1 = "Siam";
        String name2= "Anis";
        String name4= "ANIS";
        String name3 = new String("Anis");
        String str = "Hello from java";

        //System.out.println(name +" "+ name1); // دمج
        System.out.println(name + name1);

        System.out.println(name == name2);  //ال == تعمل مقارنة ب ال ref
        System.out.println(name == name3);
        System.out.println(name.equals(name3)); // equals مقارنة ب value
        System.out.println(name.length());//طول النص
        System.out.println(name.concat(name2));// دمج النص
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //name = name.toUpperCase();
        System.out.println(name.equals(name3));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf("An"));//موقع الحرف او النص
        System.out.println(str.lastIndexOf('o'));
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("java"));
        System.out.println(name.equalsIgnoreCase(name4));
        System.out.println(str.substring(2)); // يأخد مقطع
        System.out.println(str.substring(2,7)); // يأخد مقطع من --- الى



    }
}
