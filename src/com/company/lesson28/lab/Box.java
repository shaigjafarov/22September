package com.company.lesson28.lab;

public class Box<T> {

    public T t;


    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    String getObjName(){
        return t.toString();
    }
}
