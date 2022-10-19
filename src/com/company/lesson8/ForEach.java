package com.company.lesson8;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Arrayin olcusunu daxil edin= ");
        int[] ass = new int[sc.nextInt()];
//        for (int i = 0; i < ass.length; i++) {
//            System.out.println(i + " index = ");
//            ass[i] = sc.nextInt();
//        }

        for (int sf : ass) {
           sc.nextInt();

        }


        for (int w : ass) {
            System.out.println(w);
        }


    }


}

