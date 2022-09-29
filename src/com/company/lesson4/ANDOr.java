package com.company.lesson4;

import java.util.Scanner;

public class ANDOr {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);



        int c = new Scanner(System.in).nextInt(), d = 4;


        int enBoyukDeyer = c > d ? c : d  ;



//        boolean aa= c<4 || ++d<4;
//        System.out.println(d);
//        System.out.println(aa);
//        c&=4;
//        System.out.println(c);
        boolean fd = false;
        if (c > 5) {
            System.out.println("Sert odendi c boyukdu 5den");
            System.out.println("asdlff ");
        } else if (c < 5)
            System.out.println("Sert odendi c kicikdi 5den");
        else {

            System.out.println("5e beraberdi");


        }


    }
}
