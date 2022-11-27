package com.company.lesson27;

public class Static {
    int b=4;

    static  int a=5;

    static {
        System.out.println(a);
    }

    {
        System.out.println(b);
    }
    Static(){
        System.out.println("comstruktor");
    }

    public static void main(String[] args) {
        new Static();
        System.out.println("Main");
    }
}
