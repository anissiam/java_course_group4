package com.java4.oop.Inheritance;

import com.java4.oop.basics.Computer;

public class Lenovo extends Computer {
   private String model;
    public Lenovo(int ram, String company, int cpu, String year ,String model) {
        super(ram, company, cpu, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void showDats(){
        printData();
        System.out.println("Model" + model);

    }

}
