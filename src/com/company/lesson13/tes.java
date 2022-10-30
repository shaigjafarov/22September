package com.company.lesson13;

import java.lang.annotation.Repeatable;
import java.util.Random;

public class tes {
    public static void main(String[] args) {


//        Math.abs(a);
//        Math.pow(4,1/2);
//        Math.pow(3,3);
//        Math.sqrt(35);
        System.out.println(  Math.ceil(4.3));
        System.out.println(   Math.ceil(5.5));
        System.out.println(  Math.round(4.3));
        System.out.println(   Math.round(5.5));
        System.out.println(  Math.floor(4.3));
        System.out.println(   Math.floor(5.5));
        Random asd= new Random();

        asd.ints(5,1,100).forEach(System.out::println);
//        asd.nextInt(9)+1;

//        String asd="hello";
//        String asv="hello ".trim();
//        String asb="h"+"el"+"lo";
//        String as2="h".concat("el")+"lo";
//        System.out.println(asd==as2);
//        System.out.println(asb==asv);
//        System.out.println(asv.equals(asd));
//
//
        StringBuilder a1= new StringBuilder("ssdaa");
        StringBuilder a2= new StringBuilder("asdaa");
//        System.out.println(a1.equals(a2));
        System.out.println(a1.compareTo(a2));




    }
}
