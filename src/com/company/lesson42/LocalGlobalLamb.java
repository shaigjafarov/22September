package com.company.lesson42;

import java.util.function.Predicate;

public class LocalGlobalLamb {
    int a1=5;
    void  as(){

        Predicate p= a->{
            a1=a1++;
            return  true;
        };
    }
}
