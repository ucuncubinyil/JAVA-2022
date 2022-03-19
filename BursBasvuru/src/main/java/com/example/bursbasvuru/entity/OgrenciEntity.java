package com.example.bursbasvuru.entity;


import com.example.bursbasvuru.enums.EnumCinsiyet;
import com.example.bursbasvuru.enums.EnumSecimEH;

import javax.persistence.*;

@Entity
@Table
public class OgrenciEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogrenci_seq")
    private Long id;

    private Long tc;
    private String ad;
    private String soyad;

    @Enumerated(EnumType.STRING)
    private EnumCinsiyet cinsiyet;

    @ManyToOne
    private OkulEntity okul;

    private String bölümü;

    private Long sinifi;

    private Double ortalama;

    @Enumerated(EnumType.STRING)
    private EnumSecimEH sehitYakini;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public EnumCinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(EnumCinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public OkulEntity getOkul() {
        return okul;
    }

    public void setOkul(OkulEntity okul) {
        this.okul = okul;
    }

    public String getBölümü() {
        return bölümü;
    }

    public void setBölümü(String bölümü) {
        this.bölümü = bölümü;
    }

    public Long getSinifi() {
        return sinifi;
    }

    public void setSinifi(Long sinifi) {
        this.sinifi = sinifi;
    }

    public Double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(Double ortalama) {
        this.ortalama = ortalama;
    }

    public EnumSecimEH getSehitYakini() {
        return sehitYakini;
    }

    public void setSehitYakini(EnumSecimEH sehitYakini) {
        this.sehitYakini = sehitYakini;
    }
}
