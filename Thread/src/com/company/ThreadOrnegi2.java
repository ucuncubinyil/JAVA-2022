package com.company;

public class ThreadOrnegi2 implements Runnable{

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadOrnegi2());
        t1.start();
        System.out.println("Merhaba Thread !");
    }

    @Override
    public void run() {

        try {
            Thread.sleep(5*1000);
            System.out.println("Ben çalıştım");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
