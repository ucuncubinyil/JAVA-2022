package com.company.iciceornek3;

public class Kare implements Hesaplar.sayi{

    @Override
    public void hesapla(int n) {
        System.out.println("Sayının karesi : " +  n * n);
    }
}
