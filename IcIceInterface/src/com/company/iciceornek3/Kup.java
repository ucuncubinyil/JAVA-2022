package com.company.iciceornek3;

public class Kup implements Hesaplar.sayi {
    @Override
    public void hesapla(int n) {
        System.out.println("Sayının küpü: " + n * n * n);

    }
}
