package com.java4.basics.Threading;

public class MainThread {
    public static void main(String[] args) {

        for(int i = 0 ; i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<5;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
        RunClass runClass = new RunClass();
        runClass.setName("T1");
        Thread thread = new Thread(runClass);
        thread.start();

        RunClass runClass1 = new RunClass();
        runClass1.setName("T2");
        Thread thread1 = new Thread(runClass1);
        thread1.start();

       /* ThreadClass threadClass = new ThreadClass();
        threadClass.setName("T1");
        threadClass.start();
        *//*try {
            threadClass.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*//*


        ThreadClass threadClass1 = new ThreadClass();
        threadClass1.setName("T2");
        threadClass1.start();*/
    }
}
