package com.mehmetnuri.abfirmasi;

public class Mudur  extends Personel{

    private double ekGosterge;

    @Override
    public double MaasHesapla() {
        return 35000*this.ekGosterge;
    }

    public void setEkGosterge(double ekGosterge) {
        this.ekGosterge = ekGosterge;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "Ad Soyad: " + getAdSoyad() + " " +
                "Yaşı :" + getYasi() + " " +
                "Maaşı: " + this.MaasHesapla()+  " "+
                "ekGosterge=" + ekGosterge +
                '}';
    }

}

