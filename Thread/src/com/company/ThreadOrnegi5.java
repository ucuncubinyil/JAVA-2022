package com.company;

public class ThreadOrnegi5 implements Runnable{

    public static void main(String[] args) {

        /**
         *
         * ÖNEMLİ NOT
         *
         * Thread sadece main metodu içinde çalışır
         */

        Thread t1 = new Thread(new ThreadOrnegi5());
        Thread t2 = new Thread(new ThreadOrnegi5());

        t1.start();
        t2.start();

    }


    @Override
    public void run() {

        synchronized (ThreadOrnegi5.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
}
