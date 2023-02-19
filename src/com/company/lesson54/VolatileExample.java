package com.company.lesson54;

public class VolatileExample {
    private  boolean isRunning = false;

    public void start() {
        isRunning = true;
        new Thread(() -> {
            while (isRunning) {
                System.out.println("Thread is running...");
            }
            System.out.println("Thread stopped.");
        }).start();
    }

    public void stop() {
        isRunning = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        example.start();
        Thread.sleep(1000);
        example.stop();
    }
}