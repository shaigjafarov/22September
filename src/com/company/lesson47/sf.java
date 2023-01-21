package com.company.lesson47;


 class VolatileTest {
    private static int MY_INT = 0;

    public static void main(String[] args)
    {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override public void run()
        {
            for (int i = 0; i <=50; i++) {
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(MY_INT+"  "+  Thread.currentThread().getName());
                ++MY_INT;
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override public void run()
        {

            for (int i = 1; i <=50; i++) {
                try {
                    Thread.sleep(251);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(MY_INT+"  "+  Thread.currentThread().getName());
                ++MY_INT;
            }
        }
    }
}