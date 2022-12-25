package com.company.lesson39;

import java.util.Scanner;

class PopCorn {
    public void getPopCorn() {
        System.out.println("get Normal PopCorn");
    }
}

class OuterClass {
    public static void main(String[] args) {
        // Method 1;
        PopCorn p1 = new PopCorn() {
            @Override
            public void getPopCorn() {
                System.out.println("get sweet PopCorn");
            }
        };
        p1.getPopCorn();
        PopCorn p2 = new PopCorn();
        p2.getPopCorn();
        //method 2 ;

        new PopCorn() {
            @Override
            public void getPopCorn() {
                System.out.println("get salty PopCorn");
            }
        }.getPopCorn();
//
//        System.out.println("Outer class main method");
    }
}