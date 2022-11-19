package com.company.lesson23;

public class BeraberYanli extends Triangle {
    public BeraberYanli(Integer a, Integer b, Integer c) {
        super(a, b, c);
    }

    @Override
    protected double area() {
        System.out.println("BeraberYanli");
        return a+b+c;
    }
}
