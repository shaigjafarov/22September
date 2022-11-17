package com.company.lesson22.abstraction;

public class BMW extends Car{
    String name;
    Integer maxSpeed;


    @Override
    public Integer maxSpeed() {
        return maxSpeed;
    }

    public BMW(String name, Integer maxSpeed, Teker t, Engine e) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.teker=t;
        this.engine=e;
    }
}
