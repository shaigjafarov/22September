package com.company.lesson48;

import java.util.Scanner;

class GunFight {
    private int i = 1;

    synchronized public void fire() {
        for (; i <= 40; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
                if (i % 5 == 0) {
                    System.out.println("Waiting mode");
                    wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    synchronized public void reload() {
        try {
            System.out.println("reload");
//                Scanner sc = new Scanner(System.in);
//                String next = sc.next();
                if (i % 5 == 0) {
                    notify();
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class WaitDemo extends Thread {
    public static void main(String[] args) throws InterruptedException {

        GunFight gf = new GunFight();
        Thread thread = new Thread() {
            @Override
            public void run() {
                gf.fire();
            }
        };


        Thread thread1 = new Thread() {
            @Override
            public void run() {
                gf.reload();
            }
        };
        thread.start();

//        thread.getState()
//        thread1.start();
Thread.sleep(7000);


        Thread.sleep(7000);
        thread1.stop();
        thread1.start();


//        System.out.println(thread.getState());
//        while (true) {
//
//            if (thread.getState().equals( State.WAITING)) {
//                thread1.start();
//            }
//        }


    }
}