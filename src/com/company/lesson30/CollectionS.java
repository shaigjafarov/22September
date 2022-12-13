package com.company.lesson30;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.management.ObjectName;

public class CollectionS {
    static List<String> sad = new ArrayList<>();


    public static void main(String[] args) {
//        List<Integer> sldjn= new ArrayList<Integer>();
        List<? extends   Integer> arrSuper= new ArrayList<Integer>();

//arrSuper.
//        sldjn.add(12);
//        gonder(sldjn);




        List<Object> sad1= new ArrayList<>();
        gonder(sad1);
        sad.add("1");
        sad.add("2");
        sad.add("4");
//        sad1.addAll(sad);
        System.out.println(sad.contains("1"));

//        FilterPred<String> filterPred = new FilterPred<>("4");
//        boolean b = sad.removeIf(filterPred);

//        System.out.println(b);

        System.out.println(sad.contains("1"));
        System.out.println(sad.contains("2"));
        System.out.println(sad.contains("4"));

//        sad.forEach();

//        System.out.println(sad1.get(10));
//        sad1.add(sad.get(0));

        ConsumerImplSout consumerImplSout = new ConsumerImplSout();

        sad.forEach(consumerImplSout);
        forEach1(consumerImplSout);


//        System.out.println(sad.contains("3"));
//        System.out.println(sad.get(0));
//        sad.add(1, "3");

//        for (Object s :sad1) {
//            System.out.println(s);
//        }

//        list.forEach(System.out::println);


//        Collection<? extends String>  collection = new ArrayList<String>();
//        collection.add("sasd");

    }
    static void  gonder(List<? super Integer> sd){

        for (Object a:sd) {

        }


    }


    static void forEach1(ConsumerImplSout consumerImplSout) {
        Objects.requireNonNull(consumerImplSout);
        for (String t : sad) {
            consumerImplSout.accept(t);
        }
    }
}
