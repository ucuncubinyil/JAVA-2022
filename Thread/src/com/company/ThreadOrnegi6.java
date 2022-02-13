package com.company;

public class ThreadOrnegi6 implements Runnable{

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOrnegi6());
        Thread t2 = new Thread(new ThreadOrnegi6());
        Thread t3 = new Thread(new ThreadOrnegi6());

        /**
         * Önemli Not
         * Thread e öncelik vermek sekronize şekilde çalışmasını
         * garanti etmez !!!
         */
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }

    @Override
    public void run() {

        synchronized (ThreadOrnegi6.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }

    }
}
