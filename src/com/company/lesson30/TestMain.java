package com.company.lesson30;

import java.util.LinkedList;

public class TestMain {


    public static void main(String[] args) {
        LinkedList<String> arr= new LinkedList<>();
        arr.add("asd");
        arr.add("bsd");
        arr.add("csd");
//        arr.offerFirst()
        String remove = arr.remove();
        System.out.println(arr);
        System.out.println(remove);
//
//        ArrayList  asdr= new ArrayList(arr);
//        asdr.remove()


    }
}
