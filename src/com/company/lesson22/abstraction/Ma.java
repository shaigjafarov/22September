package com.company.lesson22.abstraction;


public class Ma {
    public static void main(String[] args) {
        BMW bmw= new BMW("528I",260,  new Teker(), new Engine());
        Engine engine= new Engine(6,"benzin",3000,306);
        bmw.engine=engine;
        System.out.println(bmw.engine);
        System.out.println(bmw.teker);
        System.out.println(bmw.maxSpeed);
        System.out.println(bmw.name);




    }
}
