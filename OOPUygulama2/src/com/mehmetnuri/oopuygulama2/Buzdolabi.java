package com.mehmetnuri.oopuygulama2;

public class Buzdolabi {

    private int uretimYili;
    private String modeli;
    private String marka;
    private int kapiSayisi;
    private int kapasite;
    private boolean kapakAltta;

    public Buzdolabi(int uretimYili, String modeli, String marka, int kapiSayisi, int kapasite, boolean kapakAltta) {
        this.uretimYili = uretimYili;
        this.modeli = modeli;
        this.marka = marka;
        this.kapiSayisi = kapiSayisi;
        this.kapasite = kapasite;
        this.kapakAltta = kapakAltta;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public void setKapakAltta(boolean kapakAltta) {
        this.kapakAltta = kapakAltta;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public String getModeli() {
        return modeli;
    }

    public String getMarka() {
        return marka;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public boolean isKapakAltta() {
        return kapakAltta;
    }

    @Override
    public String toString() {
        return "Buzdolabi{" +
                "uretimYili=" + uretimYili +
                ", modeli='" + modeli + '\'' +
                ", marka='" + marka + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                ", kapasite=" + kapasite +
                ", kapakAltta=" + kapakAltta +
                '}';
    }
}
