package com.mehmetnuri.meyve;

public abstract class BaseMeyve {

    private String adi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }


    public abstract String meyveAdi();
}
