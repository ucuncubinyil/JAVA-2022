package com.mehmetnuri.sirket;

public abstract class Calisan {

    private String ad;
    private String soyAd;
    private Long yas;
    private boolean askerlikDurum;
    private double maas;
    private String cepNumarasi;

    public Calisan() {
    }

    public abstract String getAd();

    public abstract String getSoyAd();

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public Long getYas() {
        return yas;
    }

    public void setYas(Long yas) {
        this.yas = yas;
    }

    public boolean isAskerlikDurum() {
        return askerlikDurum;
    }

    public void setAskerlikDurum(boolean askerlikDurum) {
        this.askerlikDurum = askerlikDurum;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public String getCepNumarasi() {
        return cepNumarasi;
    }

    public void setCepNumarasi(String cepNumarasi) {
        this.cepNumarasi = cepNumarasi;
    }
}
