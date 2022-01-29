package com.mehmetnuri.derya;

public class Zara extends Canta{

    private boolean kayisiElmasMi;
    private boolean otopedikMi;
    private String mensei;

    public Zara() {

    }


    public boolean isKayisiElmasMi() {
        return kayisiElmasMi;
    }

    public void setKayisiElmasMi(boolean kayisiElmasMi) {
        this.kayisiElmasMi = kayisiElmasMi;
    }

    public boolean isOtopedikMi() {
        return otopedikMi;
    }

    public void setOtopedikMi(boolean otopedikMi) {
        this.otopedikMi = otopedikMi;
    }

    public String getMensei() {
        return mensei;
    }

    public void setMensei(String mensei) {
        this.mensei = mensei;
    }

    @Override
    public String toString() {
        return "Rengi: " + getRengi() + "\n" +
                "Markası: " + getMarkasi() + "\n" +
                "Göz Sayısı: " + getGozSayisi() + "\n" +
                "Çanta Deri Mi: " + isDeriMi() + "\n" +
                "Kayışı Elmas Mı: " + isKayisiElmasMi() + "\n" +
                "Ortopedik Mi: " + isOtopedikMi() + "\n" +
                "Çanta Meşei: " + getMensei();
    }
}
