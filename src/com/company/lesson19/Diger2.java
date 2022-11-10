package com.company.lesson19;

public final class Diger2 {

    final int a;
    final static int b;


    {


       int s=4;

//        a=9;
//        System.out.println("Init block working "+ this.a);
    }




    static {
        b=3;
        System.out.println("Static Init block work  "+b);
    }

    public Diger2 (){

        System.out.println();


        a=4;
        System.out.println("Constructor isledi");

    }


    public static void main(String[] args) {
        Diger2 diger2= new Diger2();
        Diger2 diger3= new Diger2();


    }

    static Integer cem(int a, int b){

        Diger2 d= new Diger2();
        System.out.println(d.cix(10,5));
        return a+b;
    }

    final  Integer cix(int a, int b){
        cem(4,5);
        return a-b;
    }




}
