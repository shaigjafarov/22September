package com.company.lesson4;

public class DefaultValue {
    int a;
    short a1;
    long a2;
    byte a3;
    double b;
    float b1;
    boolean c;
    char d;
    String f;

    void cixisaVer() {
        System.out.println("Tam ededler");
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("Kesir edeler");
        System.out.println(b);
        System.out.println(b1);
        System.out.println("Bool deyer");
        System.out.println(c);
        System.out.println("Char defautl value");
        System.out.println(d);
        System.out.println("String default value");
        System.out.println(f);

    }


    public static void main(String[] args) {
        DefaultValue d = new DefaultValue();
        d.cixisaVer();
        d.sss();
    }

    void sss() {
        StringBuilder a = new StringBuilder("5");
        StringBuilder b = a;
        a.append("1");
        System.out.println(a);
        System.out.println(b);

        int aa = 1111111111;
        int bb = 10;
        long cc =  (long)( aa * bb);
        System.out.println(aa * bb);
        System.out.println(cc);
    }


}
