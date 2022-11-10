package com.company.lesson19;

public class Diger {
    public static void main(String[] args) {
        Student s1 = new Student("sad", "sadv");
        Student s2 = new Student("qwefrq", "qwer");

        Student[] sarr = {s1, s2};


        for (Student ert : sarr) {
//            System.out.println(ert.toString1());
            System.out.println(ert);
        }


    }


    Integer cemaveb(Integer a, Integer b) {
        return a + b;
    }


    void cem(Integer a, Integer b, Integer c) {
//        return a+b+c;
    }
}
