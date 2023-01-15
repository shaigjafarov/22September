package com.company.lesson46;

import com.company.lesson38.transfer.exceptions.InsufficientBalanceExceptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Opt {

    public static void main(String[] args) {
//        Optional<String> chuck = Optional.ofNullable(null);


//        List<String> list = new ArrayList<>();
//        list.add("Chuck Norris");
//        list.add("Arif Pehlivan");
//        list.add("Mario Jardel");
//        Optional<List<String>> optList = Optional.of(list);
//        optList.ifPresent(System.out::println);
//
//        if(optList.isPresent()){
//            System.out.println(optList);
//        }

//
//        Optional<String> test = Optional.of("Arif Pehlivan");
//        Optional<Integer> integer = test.map(String::length);


//        List<String> list1 = new ArrayList<>();
//        list.add("Chuck Norris");
//        list.add("Arif Pehlivan");
//        list.add("Mario Jardel");
//        Optional<List<String>> optList1 = Optional.of(list1);
//        Optional<Integer> integer = optList1.map(List::size);
//        integer.get();


        Optional<String> chuck = Optional.empty();
        System.out.println(chuck.orElseGet(()->"1.7"));
        System.out.println(chuck.orElse("1.7"));
        System.out.println(chuck.orElseThrow(RuntimeException::new));

    }
    private static String testOrElse(){
        return   "Dur yapma";
    }
}
