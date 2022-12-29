package com.company.lesson41;

public class MainLam {
    public static void main(String[] args) {

        MainLam mainLam = new MainLam() {
        };
        A as = () -> 0;
        A aa = () -> {
            return 6;
        };
    }

    void sass() {
        System.out.println("hola");
    }
}

abstract class MM {
    public abstract void ss();

}

@FunctionalInterface
interface A {
    // annotation
//    void  sdf();
    int sd2f();
}
