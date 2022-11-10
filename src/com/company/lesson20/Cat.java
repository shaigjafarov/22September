package com.company.lesson20;

public class Cat implements Runnable, Miau {

    String pisikQacir;
    String pisikiMioldayir;

    public Cat(String pisikQacir, String pisikiMioldayir) {
        this.pisikQacir = pisikQacir;
        this.pisikiMioldayir = pisikiMioldayir;
    }

    public Cat() {
    }

    @Override
    public void run() {
        System.out.println(pisikQacir);
    }


    @Override
    public void mioaldamag() {
        System.out.println(pisikiMioldayir);
    }
}
