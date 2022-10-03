package com.company.lesson4.task;

import java.util.Scanner;

public class Task1Binary {
    static int s1, s2, s3, s4, s5, s6, s7, s8, s9;

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();

        if (a <= 50 && a > 0) {
            s1 = a % 2;
            a = a / 2;
            if (a > 0) {
                s2 = a % 2;
                a = a / 2;
                if (a > 0) {
                    s3 = a % 2;
                    a = a / 2;
                    if (a > 0) {
                        s4 = a % 2;
                        a = a / 2;
                        if (a > 0) {

                            s5 = a % 2;
                            a = a / 2;

                            if (a > 0) {
                                s6 = a % 2;
                            }
                        }
                    }
                }
            }


        } else System.out.println("Verilmis eded araliqa daxil deyil");

        System.out.println(s9 + "" + s8 + "" + s7 + "" + s6 + "" + s5 + "" + s4 + "" + s3 + "" + s2 + "" + s1);
    }


}
