package com.company.lesson21;

class Main {

    public static void main1(String[] args) {
        JavaInter javaInter = new JavaInter("Farid");
//        javaInter.
        JavaInterAta javaInter1 = new JavaInter("Farid");
//        javaInter1.
        JavaInterBaba javaInter2 = new JavaInter("Farid");
//        javaInter2.



//        Main m = new Main();
        System.out.println(javaInter.toString());
        String as = new String("asasd");
        exp1(as);
//        exp(javaInter);
        System.out.println(javaInter);
    }

    static void exp(JavaInter javaInter) {
        javaInter.name = "Sahil";
    }

    static void exp1(String sdf) {
        System.out.println(sdf);
    }

    public static void main(String[] args) {
        JavaInter as= new JavaInter("as");
        JavaInterQardas asQa= new JavaInterQardas();

       as.ataninAdi();
       asQa.ataninAdi();

    }
}
