package com.company.lesson38.transfer.check;

public class MainRecur {


    public static void main(String[] args) {
        System.out.println(a(5));
    }

    public static Integer a(int i){
       return i+a12(i-1);//5+X(4)

    }    public static Integer a12(int i){
       return i+a1(i-1);//4+X(3)

    }
    public static Integer a1(int i){
        return i+a2(i-1);//3+X(2)

    }
    public static Integer a2(int i){
        return i+a3(i-1);//2+X(1)

    }
    public static Integer a3(int i){
        return i;//1

    }




}
