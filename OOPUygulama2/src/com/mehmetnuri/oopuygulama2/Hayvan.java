package com.mehmetnuri.oopuygulama2;

public class Hayvan {

    private int yas;
    private boolean cinsiyet;
    private String cinsi;
    private int ayakSayısı;
    private String ses;
    private String deriRengi;
    private boolean tuy;
    private boolean kanat;
    private boolean beslenme;

    public Hayvan() {

    }

    public Hayvan(int yas, boolean cinsiyet, String cinsi) {
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.cinsi = cinsi;
    }

    public Hayvan(int yas, boolean cinsiyet, String cinsi, int ayakSayısı, String ses, String deriRengi, boolean tuy,
                  boolean kanat, boolean beslenme) {
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.cinsi = cinsi;
        this.ayakSayısı = ayakSayısı;
        this.ses = ses;
        this.deriRengi = deriRengi;
        this.tuy = tuy;
        this.kanat = kanat;
        this.beslenme = beslenme;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", cinsi='" + cinsi + '\'' +
                ", ayakSayısı=" + ayakSayısı +
                ", ses='" + ses + '\'' +
                ", deriRengi='" + deriRengi + '\'' +
                ", tuy=" + tuy +
                ", kanat=" + kanat +
                ", beslenme=" + beslenme +
                '}';
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public boolean isCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(boolean cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public int getAyakSayısı() {
        return ayakSayısı;
    }

    public void setAyakSayısı(int ayakSayısı) {
        this.ayakSayısı = ayakSayısı;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getDeriRengi() {
        return deriRengi;
    }

    public void setDeriRengi(String deriRengi) {
        this.deriRengi = deriRengi;
    }

    public boolean isTuy() {
        return tuy;
    }

    public void setTuy(boolean tuy) {
        this.tuy = tuy;
    }

    public boolean isKanat() {
        return kanat;
    }

    public void setKanat(boolean kanat) {
        this.kanat = kanat;
    }

    public boolean isBeslenme() {
        return beslenme;
    }

    public void setBeslenme(boolean beslenme) {
        this.beslenme = beslenme;
    }
}
