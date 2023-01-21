package com.company.lesson46;

import com.company.lesson28.TestHex;
import java.util.Date;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class kjzdf {


//    public static AtomicInteger a =new AtomicInteger(0);
    public static Integer a =0;

    public static void main(String[] args) {

        Runnable r1 = () -> {
            try {
                for (int i = 0; i < 30; i++) {
                    Thread.sleep(250);

                    synchronized (kjzdf.class){
                    System.out.println(Thread.currentThread().getName()+"  a: " +  increment());}

//                    System.out.println(Thread.currentThread().getName()+"  a: "+  a++);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Thread a = new Thread(r1);
        a.start();

        Thread a1 = new Thread(r1);
        a1.start();

        System.out.println("AAAAAA"+ a);
    }


    static    int   increment (){
        return ++a;
    }


}
