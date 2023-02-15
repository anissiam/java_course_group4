package com.java4.oop.files;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        //File file = new File("/home/anis/Helloeeee.txt");
        //file.delete();
        System.out.println(file.getAbsoluteFile());
        if (file .exists()){
            System.out.println("exist");

        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
