package com.java4.oop.Inheritance;

public class Yoga extends Lenovo{
    private String feature;
    public Yoga(int ram, String company, int cpu, String year , String model , String feature) {
        super(ram, company, cpu, year , model);
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void showData(){
        showDats();
        System.out.println("Feature " + feature);
    }
}
