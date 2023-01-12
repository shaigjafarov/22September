package com.company.lesson45;

import com.company.lesson28.TestSalam;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Comparesa

{    static  int i =0;

    public static void main(String[] args) {
        List<Integer[]> list = List.of(new Integer[]{1,45,65},new Integer[]{2,76,8});
        List<Integer> list1 = List.of(6, 7);
        List<Integer> list2 = List.of(13, 2);
//        Stream<List<Integer>> listStream= Stream.of(list, list1, list2);
        list.stream().flatMap(a-> Arrays.stream(a)).forEach(System.out::println);

//        listStream.forEach(System.out::println);

//        listStream.flatMap(list45->list45.stream().filter(a->a>3)).forEach(System.out::println);


        //4 0
        // 5 1
        // 6 2
//        Stream.iterate(3, a->++a).peek(a-> System.out.print(a+"-")).map(a->Math.pow(a, i++)).limit(4).forEach(System.out::println);

    }
}
