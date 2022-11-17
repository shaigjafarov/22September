package com.company.lesson22.abstraction;

public class Engine {
    Integer cylinder= 4;
    String type="Benzin";
    Integer size=1998;
    Integer hp=160;

    public Engine(Integer cylinder, String type, Integer size, Integer hp) {
        this.cylinder = cylinder;
        this.type = type;
        this.size = size;
        this.hp = hp;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylinder=" + cylinder +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", hp=" + hp +
                '}';
    }
}
