package com.company.muhedisler;

import com.company.interfaces.IMuhendis;

public class PCMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean adliSicil;

    public PCMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumuSorgula() {
        if (askerlik) {
            System.out.println("Askerliğini yaptı");
        }else {
            System.out.println("Askerliğini yapmadı");
        }
    }

    @Override
    public String mezuniyetOrtalamasi(double derece) {
        return "Ortalama : " + derece;
    }

    @Override
    public void adliSicilKaydiSorgula() {
        if (adliSicil) {
            System.out.println("Adli sicil kaydı var.");
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
}
