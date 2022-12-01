package com.company.lesson28;

import com.company.lesson28.lab.Box;
import com.company.lesson28.lab.Cat;
import com.company.lesson28.lab.Dog;
import java.util.ArrayList;
import java.util.List;

public class TestHex {

    public static void main(String[] args) {

        List<? super Integer> foo3 = new ArrayList<>();  // Integer is a "superclass" of Integer (in this context)
        List<? super Integer> foo4 = new ArrayList<Number>();   // Number is a superclass of Integer
        List<? super Integer> foo5 = new ArrayList<Object>();
        List<? > foo6 = new ArrayList<>();
        long aa0F245C = Long.parseLong("101", 2);
        long ashj=0x15;

//
//        System.out.println(aa0F245C);
//        System.out.println(ashj);
//        System.out.println(Long.toHexString(ashj));


        Cat mi = new Cat("tom");
        Cat mi2 = new Cat("tom");
        Dog dog = new Dog("tom");

        Box b1= new Box<>(mi);
        Box b12= new Box<>(dog);

        System.out.println(TestHex.<Cat>ekranaYazdir(b1,b12));


//        Class


    }


     public  static <T> boolean  ekranaYazdir(Box<T> t1, Box<T> t2){
        return t1.getT().equals(t2.getT()) ;

     }
}
