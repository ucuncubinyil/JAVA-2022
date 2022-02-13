package com.company;

public class ThreadOrnegi extends Thread{

    public static void main(String[] args) {

        ThreadOrnegi threadOrnegi = new ThreadOrnegi();
        threadOrnegi.start();
        System.out.println("Merhaba Thread !");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(0);
            System.out.println("Uzun işlem sonucu");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
