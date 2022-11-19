package com.company.lesson23;

import javax.swing.*;

public class Duzbacli extends Triangle {


    public Duzbacli(Integer a, Integer b, Integer c) {

        super(a, b, c);
        System.out.println("Duzbucaqlidi");

    }

    @Override
    protected double area() {

        return (a*b)/2.0;
    }
}
