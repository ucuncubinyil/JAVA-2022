package com.mehmetnuri.oopuygulama2;

public class Telefon {

    private int bataryaKapasitesi;
    private String modeli;
    private String rengi;
    private boolean kamera;
    private int cekirdekSayisi;

    private boolean besGDurumu;

    public Telefon() {

    }

    public Telefon(int bataryaKapasitesi, String modeli, String rengi, boolean kamera, int cekirdekSayisi) {
        this.bataryaKapasitesi = bataryaKapasitesi;
        this.modeli = modeli;
        this.rengi = rengi;
        this.kamera = kamera;
        this.cekirdekSayisi = cekirdekSayisi;
    }

    public int getBataryaKapasitesi() {
        return bataryaKapasitesi;
    }

    public String getModeli() {
        return modeli;
    }

    public String getRengi() {
        return rengi;
    }

    public boolean isKamera() {
        return kamera;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public void setBataryaKapasitesi(int bataryaKapasitesi) {
        this.bataryaKapasitesi = bataryaKapasitesi;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public void setKamera(boolean kamera) {
        this.kamera = kamera;
    }

    public void setCekirdekSayisi(int cekirdekSayisi) {
        this.cekirdekSayisi = cekirdekSayisi;
    }

    public boolean getBesGDurumu() {
        return besGDurumu;
    }

    public void setBesGDurumu(boolean besGDurumu) {
        this.besGDurumu = besGDurumu;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "bataryaKapasitesi=" + bataryaKapasitesi +
                ", modeli='" + modeli + '\'' +
                ", rengi='" + rengi + '\'' +
                ", kamera=" + kamera +
                ", cekirdekSayisi=" + cekirdekSayisi +
                '}';
    }
}
