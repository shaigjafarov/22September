package com.company.lesson22.abstraction;

public class Teker {

    String name="Michelin";
    Integer en= 225;
    Integer maxSpeed=230;
    String season="all season";
    Integer maxLoad=500;


    public Teker(String name, Integer en, Integer maxSpeed, String season, Integer maxLoad) {
        this.name = name;
        this.en = en;
        this.maxSpeed = maxSpeed;
        this.season = season;
        this.maxLoad = maxLoad;
    }

    public Teker() {
    }

    @Override
    public String toString() {
        return "Teker{" +
                "name='" + name + '\'' +
                ", en=" + en +
                ", maxSpeed=" + maxSpeed +
                ", season='" + season + '\'' +
                ", maxLoad=" + maxLoad +
                '}';
    }
}
