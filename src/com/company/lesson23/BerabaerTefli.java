package com.company.lesson23;

public class BerabaerTefli extends Triangle {


    public BerabaerTefli(Integer a, Integer b, Integer c) {
        super(a, b, c);

    }



    @Override
    protected double area() {
        System.out.println("BerabaerTefli");
        return a+b;
    }
}
