package com.company.iciceornek2;

public class Otomobil implements AracTur.arac, AracTur.moto{

    @Override
    public void getYolcuSayisi() {
        System.out.println("Yolcu sayısı: "+ 16);
    }

    @Override
    public void getMotorGucu() {
        System.out.println("Motor Gücü: " + 6000);
    }
}
