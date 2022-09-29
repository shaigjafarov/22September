package com.company.lesson4;

public class MultiplicationShift {

    public static void main(String[] args) {
//        System.out.println(7.0/5);
//        System.out.println(23484%5%2);
        int a = 5;

        a = a >> 1;
        System.out.println(a);
        a = a << 1;
        System.out.println(a);


        System.out.println(0b1010 >>> 2);


    }
}
