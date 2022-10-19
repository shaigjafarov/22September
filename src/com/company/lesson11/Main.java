package com.company.lesson11;

public class Main {


    public static void main(String[] args) {
       OUTER: for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(j==2){
                    break ;
                }
                System.out.print("i= "+ i+" ");
                System.out.println("j= "+j);
                continue ;
            }
           System.out.println("Col dovr");

        }
    }
}
