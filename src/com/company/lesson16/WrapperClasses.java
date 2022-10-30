package com.company.lesson16;

public class WrapperClasses {

    public static void main(String[] args) {
        Boolean integer = Boolean.valueOf("true");

        Character asd = 'a';
        Character b = asd;
        asd.toString();

        System.out.println(integer);
        varagst(1,2,3,4,5);
    }

    static int varagst(int... arr) {
        int cem = 0;
        for (int i = 0; i < arr.length; i++) {
            cem += arr[i];
        }


        return cem
                ;
    }


}
