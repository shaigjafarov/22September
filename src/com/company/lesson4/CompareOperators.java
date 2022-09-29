package com.company.lesson4;

public class CompareOperators {

    public static void main(String[] args) {
        boolean a = '4' >= 100;

        boolean b = 34 != 23;
//        b=!b;
        System.out.println(a);
        sad();
    }


    static void sad() {

        int a = 10;

        int b = 11;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

// 1010
// 1010
//

    }
}
