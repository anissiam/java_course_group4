package com.java4.basics.Threading;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println(getName());
        for(int i = 0 ; i<5;i++){
            System.out.println(getName() +  " Hello" );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
