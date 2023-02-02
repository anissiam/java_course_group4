package com.java4.oop.Inheritance;

import com.java4.oop.basics.Computer;

public class MSI extends Computer {
    boolean rgb;
    public MSI(int ram, String company, int cpu, String year , boolean rgb) {
        super(ram, company, cpu, year);
        this.rgb = rgb;
    }

    public void showDats(){
        printData();
        System.out.println("RGB " + rgb);
    }
}
