package com.company.lesson47;

import java.util.concurrent.atomic.AtomicInteger;

public class Valo {
    static private AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(count.incrementAndGet());
            }


//            System.out.println(count);

        });

        t1.setPriority(10);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println( count.decrementAndGet());
            }
//            System.out.println(count);
        });
        t2.setPriority(1);
        t1.start();
        t2.start();


    }

//    public static  void plusMinus(Boolean deyer){
//        if (deyer) {
//            count++;
//        } else {
//            count--;
//        }
//        try {
//            Thread.sleep(250);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println(count);
//
//    }
}
