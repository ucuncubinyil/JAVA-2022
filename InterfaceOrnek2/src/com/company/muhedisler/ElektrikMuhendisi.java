package com.company.muhedisler;

import com.company.interfaces.IMuhendis;

public class ElektrikMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean sicilKaydi;


    public ElektrikMuhendisi() {
    }

    public ElektrikMuhendisi(boolean askerlik, boolean sicilKaydi) {
        this.askerlik = askerlik;
        this.sicilKaydi = sicilKaydi;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik == true) {
            System.out.println("Askerliğini yaptı");
        }else {
            System.out.println("Askerliğini yapmadı");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortlaması: " + derece;
    }

    @Override
    public void adliSicilKaydiSorgula() {
        if (sicilKaydi) {
            System.out.println("Adli Sicil kaydı var !!");
        }else {
            System.out.println("Adli sicil kaydı yok");
        }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak aşağıdaki şirketlerde çalıştım.");
        for (String tecrube : array) {
            System.out.println(tecrube);
        }
    }

    public boolean isAskerlik() {
        return askerlik;
    }

    public void setAskerlik(boolean askerlik) {
        this.askerlik = askerlik;
    }

    public boolean isSicilKaydi() {
        return sicilKaydi;
    }

    public void setSicilKaydi(boolean sicilKaydi) {
        this.sicilKaydi = sicilKaydi;
    }
}
