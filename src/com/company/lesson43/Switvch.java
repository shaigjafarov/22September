package com.company.lesson43;

public class Switvch {
//    public static void main(String[] args) {
//
//        int val = switch ("x") {
//            case "x", "y" :
//                Object yield;
//                yield 1;
//            case "z", "w" :
//                yield 2;
//        };
//    }
}
enum Enums
{
    A(1), B(2), C(3);

    private Enums(int q)
    {
        System.out.println(q);
    }
}

 class MainClass
{
    public static void main(String[] args)
    {
        Enum en=Enums.A;
    }
}
