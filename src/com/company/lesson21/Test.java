package com.company.lesson21;

public class Test {
    { 
        System.out.println("1"); 
    } 

    Test () { 
        System.out.println("2"); 
    } 

    static { 
        System.out.println("3"); 
    } 

    { 
        System.out.println("4"); 
    } 

    public static void main(String[] args) { 
        new Test(); 
    } 
} 