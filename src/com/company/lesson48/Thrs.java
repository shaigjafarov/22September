package com.company.lesson48;

public class Thrs {
    public static void main(String[] args) throws InterruptedException {



        Thread thread1Wait= new Thread(()->{
            for (int i = 0; ; i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1Wait.start();



//        Thread.sleep(5000);

        thread1Wait.wait();

        Thread.sleep(5000);

        thread1Wait.notify();



    }
}
