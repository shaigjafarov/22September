package com.company.lesson21;

import java.util.Random;

public interface JavaInterAta extends JavaInterBaba {
    Integer a=5;
    String name="JacaAta";
    public static final Integer b=3;

    @Override
    public abstract Integer cem(int a, int b);


    Integer cixma(int a, int b);


    static Integer randomIntDeyer() {
        Random random = new Random();
        return random.nextInt();
    }

    @Override
    default void ataninAdi() {
        System.out.println("JavaInterAta");
    }


}
