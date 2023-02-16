package com.java4.oop.files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        File file = new File("Hello1.txt");
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

        /*try {
            FileWriter fileWriter = new FileWriter(file,false);
            char[] cc = {'a', 'n', 'i', 's'};
            fileWriter.write("Hello from java\n");
            fileWriter.write(80);
            fileWriter.write("\n");
            fileWriter.write(cc);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*try {
            FileReader fileReader = new FileReader(file);
            int c = (char) fileReader.read();

            while (c!=-1){
                System.out.print((char) c);
                c = fileReader.read();
            }
            *//*System.out.println((char) fileReader.read());*//*
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/


        /*try {
            FileOutputStream stream = new FileOutputStream(file);
            stream.write("Hello from java again".getBytes());
            stream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        try {
            FileInputStream stream = new FileInputStream(file);
             int c=  stream.read();
             while (c!=-1){
                 System.out.print((char) c);
                 c = stream.read();
             }
            stream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
