package com.company.lesson41;

import java.util.List;
import java.util.function.UnaryOperator;

public class MethodRefExp {
    static int ab=7;
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//        UnaryOperator<Integer> kcv= (i)->i*i;
        UnaryOperator<Integer> kcv1 = new HesabKItab()::kvds;
        Kcs<Integer> integerKcs = new HesabKItab()::kvds;

        list.forEach(a -> System.out.println(integerKcs.ert(a)+ab));

        ab++;

        for (Integer i : list) {
            System.out.println(integerKcs.ert(i));
        }

    }
}

class HesabKItab {

    public Integer kvds(Integer o) {
        return o * o;
    }
}

@FunctionalInterface
interface Kcs<T> {
    T ert(T t);
}
