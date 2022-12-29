package com.company.lesson40;

import java.util.ArrayList;
import java.util.List;

public class A {
    class B {
        void qwe() {
        }
    }


    void anoniM() {
        System.out.println("www");
    }

    static void nese() {
//         A  sdd= new A();
//       B b = sdd.new B();
//       b.qwe();
//         sdd.B.
//      B asd=new B();
    }

}

interface R {
    void run();
}

class T {
    public static void main(String[] args) {
        R r = new R() {
            @Override
            public void run() {
                System.out.println("sdkjd");
            }
        };
        R r1 = new R() {
            @Override
            public void run() {
                System.out.println("adfso");
            }
        };
//        r.run();
//        D.interF(r);
//        D.interF(r1);
    }


}

class D{

    static  void interF(){
        int a=5;
        class Ar{
            void ac(){
                System.out.println(a);
            }
        }
        Ar sdl= new Ar();
        sdl.ac();

    }
}
class C {

    void asdf() {
        A a = new A() { // a= new B    ---- class B extends A
            @Override
            void anoniM() {
                System.out.println("helo");
            }
        };
        a.anoniM();
        A a1 = new A();
        a1.anoniM();
    }


    public static void main(String[] args) {
        new C().asdf();
    }

}
