package com.company.lesson40;

public class Car {
    String name;
    Integer hp;

    public Car(String name, Integer hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}
