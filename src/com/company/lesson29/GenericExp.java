package com.company.lesson29;

public class GenericExp <T> {

    private T  t;

    public GenericExp(T t) {
        this.t = t;
    }
    public GenericExp() {
   }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
