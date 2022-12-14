package com.company.lesson33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> list= List.of(1,2,3,4,5,6);
        Scanner scanner= new Scanner(System.in);

        scanner.hasNext();

        scanner.next();


//        for (Integer integer:list) {
//            System.out.println(integer);
//        }

        Iterator iterator= list.iterator();
//Integer
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
