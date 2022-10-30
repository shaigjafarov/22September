package com.company.lesson15;

import com.company.basc.Util;
import java.util.Random;

public class MethodChain {
    // public     // all class and package access
    // protected  //inherit relation and same package
    // default   // same package
    // private   // same class
     static int a=5;

    public static void main(String[] args) {
         String  date= "02.02.2000";

        boolean b = Util.validDateFormat(date);

        System.out.println(b);
    }

    public  static int randomInt(){
//        int ahgd = MethodChain.a;
        Random as= new Random();
       return as.nextInt(10);
    }

    public static  int cem(int a, int b){
        return  a+b;
    }

    public static int  toConsole(int q){
        return q;
    }
}
