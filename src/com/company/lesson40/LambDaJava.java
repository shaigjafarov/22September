package com.company.lesson40;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambDaJava {


    public static void main(String[] args) {
        List<Car> list= new ArrayList<>(List.of(
                new Car("auid rs6",300),
                new Car("optima",159),
                new Car("golf r",250),
                new Car("gs350",200),
                new Car("gtr ",500)
                ));
//Comparable
        Comparator<Car> comparator= (a,b)->a.hp-b.hp;
        list.sort(comparator);
//        Consumer<Car> consumer= System.out::println;
        list.forEach(a-> System.out.println(a));



//        List<Integer> list= new ArrayList<>(List.of(1,2,6,4,2,8,4,546,9));
//        Collections.sort(list);
//        Consumer<Integer> consumer= a-> System.out.println(a);
//        list.forEach(consumer);

//        RunnableA sad = new RunnableA() {
//            @Override
//            public int generate() {
//                return new Random().nextInt();
//            }
//        };
//        System.out.println(sad.generate());
//        Predicate<>
//        Function<>
//        Consumer<>


//
//        RunnableA sad1= a->++a;;
//        System.out.println(sad1.generate(5));



    }
//       randomEdedGoster(sad);
//
//    }
//    static void randomEdedGoster(RunnableA r){
//        System.out.println(r.generate());
//    }

}
interface  RunnableA{
    int generate(int a);
}