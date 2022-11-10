package com.company.lesson17;


import com.company.lesson14.Basqa;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Foo {
    static int statValue = 10;

    public String ad;
    public String surname;
    public Integer age;
    public String createdDate;

    public Foo(String ad, String surname, Integer age) {
        this.ad=ad;
        this.surname=surname;
        this.age=age;
        this.createdDate= LocalDateTime.now().toString();
    }



//    public Foo(String ad) {
//        this("ad");
////        this("5","43",3);
////        this.ad=ad;
//    }
    public Foo(int age) {
        this.age=age;
    }


}

class Bar {
    public static void main(String[] args) {
        Foo a1 = new Foo("Abs", "Absov", 12);
        Foo.statValue = 6;
        Foo a2 = new Foo("LMn", "Lmnova", 14);
        Foo.statValue = 7;

        System.out.println(a1.statValue);
        System.out.println(a2.statValue);

    }
}

