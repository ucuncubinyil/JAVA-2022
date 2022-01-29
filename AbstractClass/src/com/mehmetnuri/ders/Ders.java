package com.mehmetnuri.ders;

public abstract class Ders {

    private String adi;
    private int sinifNo;

    public abstract String getAdi();

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getSinifNo() {
        return sinifNo;
    }

    public void setSinifNo(int sinifNo) {
        this.sinifNo = sinifNo;
    }
}
