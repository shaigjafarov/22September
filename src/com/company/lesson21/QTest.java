package com.company.lesson21;

public class QTest {
    static {
        System.out.print("1"); 
    } 

    public static void main(String[] args) { 
        new QTest();
        System.out.print("2");
    }

    static { 
        System.out.print("3"); 
    } 
} 