package com.company.lesson23;


public abstract class Triangle extends Figure {

    protected Integer a;
    protected Integer b;
    protected Integer c;


    public Triangle(Integer a, Integer b, Integer c) {
        System.out.println("Triangle constructor icra olundu");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
