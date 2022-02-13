package com.company;

public class ThreadOrnegi4 implements Runnable{

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOrnegi4(3000));
        Thread t2 = new Thread(new ThreadOrnegi4(6000));

        t1.start();
        t2.start();

    }

    int zaman;

    public ThreadOrnegi4(int zaman) {
        this.zaman = zaman;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.zaman);
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getId());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
