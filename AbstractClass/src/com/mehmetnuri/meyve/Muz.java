package com.mehmetnuri.meyve;

public class Muz extends BaseMeyve{

    private String rengi;
    private double fiyati;

    public void ozellik(String rengi, double fiyati) {
        this.rengi = rengi;
        this.fiyati = fiyati;
    }

    @Override
    public String meyveAdi() {
        return (getAdi() + " "+  rengi +" " + fiyati);
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }
}
