package com.company.lesson49;

import com.sun.source.doctree.ThrowsTree;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadExcutor {


    public static void main(String[] args) throws InterruptedException {
        Thread m1 = new MyThread();
        Thread m2 = new MyThread();
        Thread m3 = new MyThread();
        Thread m4 = new MyThread();
        Thread m5 = new MyThread();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(m1);
        executorService.submit(m2);
        executorService.submit(m3);
        executorService.submit(m4);
        executorService.submit(m5);
        Thread.sleep(2000);

        executorService.awaitTermination(1, TimeUnit.SECONDS);

//        executorService.submit();
//        executorService.submit(m1);
//        Thread.sleep(2000);


//        executorService.submit(m2);


//        executorService.


    }
}


class MyThread extends Thread {


    @Override
    public void run() {
        {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + "  " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
