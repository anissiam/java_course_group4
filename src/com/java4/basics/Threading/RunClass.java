package com.java4.basics.Threading;

public class RunClass implements Runnable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
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
