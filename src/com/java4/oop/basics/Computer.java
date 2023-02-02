package com.java4.oop.basics;

public class Computer {
    private int ram;
    private String company;
    private int cpu;
    private String year;

    public Computer() {
    }

    public Computer(int ram, String company, int cpu, String year) {
        this.ram = ram;
        this.company = company;
        this.cpu = cpu;
        this.year = year;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void printData(){
        System.out.println("Company " + company +
                " Ram " + ram + "GB" +
                " CPU i" + cpu +
                " Year " + year);
    }
    public void hi(){
        System.out.println("HIIIIIII");
    }
}
