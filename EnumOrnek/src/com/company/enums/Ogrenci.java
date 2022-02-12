package com.company.enums;

public class Ogrenci {

    private Long tcNo;
    private String ad;
    private String soyAd;
    private EnumGecmeDurumlari gecmeDurumu;

    public Long getTcNo() {
        return tcNo;
    }

    public void setTcNo(Long tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public EnumGecmeDurumlari getGecmeDurumu() {
        return gecmeDurumu;
    }

    public void setGecmeDurumu(EnumGecmeDurumlari gecmeDurumu) {
        this.gecmeDurumu = gecmeDurumu;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "tcNo=" + tcNo +
                ", ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", gecmeDurumu=" + gecmeDurumu.getDisplayValue() +
                '}';
    }
}
