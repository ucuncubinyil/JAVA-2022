package com.mehmetnuri.oopuygulama2;

public class Bilgisayar {

    private int uretimYili;
    private int cigdemSayisi;
    private String modeli;
    private double ekranBoyutu;
    private boolean dizustuMu;
    private int ramKapasitesi;
    private int harddiskKapasitesi;
    private boolean ssdVar;

    public Bilgisayar() {
    }

    public Bilgisayar(int uretimYili, int cigdemSayisi, String modeli) {
        this.uretimYili = uretimYili;
        this.cigdemSayisi = cigdemSayisi;
        this.modeli = modeli;
    }

    public Bilgisayar(int uretimYili, int cigdemSayisi, String modeli, double ekranBoyutu, boolean dizustuMu,
                      int ramKapasitesi, int harddiskKapasitesi, boolean ssdVar) {
        this.uretimYili = uretimYili;
        this.cigdemSayisi = cigdemSayisi;
        this.modeli = modeli;
        this.ekranBoyutu = ekranBoyutu;
        this.dizustuMu = dizustuMu;
        this.ramKapasitesi = ramKapasitesi;
        this.harddiskKapasitesi = harddiskKapasitesi;
        this.ssdVar = ssdVar;
    }


    public int getUretimYili() {
        return uretimYili;
    }

    public int getCigdemSayisi() {
        return cigdemSayisi;
    }

    public String getModeli() {
        return modeli;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public boolean isDizustuMu() {
        return dizustuMu;
    }

    public int getRamKapasitesi() {
        return ramKapasitesi;
    }

    public int getHarddiskKapasitesi() {
        return harddiskKapasitesi;
    }

    public boolean isSsdVar() {
        return ssdVar;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public void setCigdemSayisi(int cigdemSayisi) {
        this.cigdemSayisi = cigdemSayisi;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public void setDizustuMu(boolean dizustuMu) {
        this.dizustuMu = dizustuMu;
    }

    public void setRamKapasitesi(int ramKapasitesi) {
        this.ramKapasitesi = ramKapasitesi;
    }

    public void setHarddiskKapasitesi(int harddiskKapasitesi) {
        this.harddiskKapasitesi = harddiskKapasitesi;
    }

    public void setSsdVar(boolean ssdVar) {
        this.ssdVar = ssdVar;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "uretimYili=" + uretimYili +
                ", cigdemSayisi=" + cigdemSayisi +
                ", modeli='" + modeli + '\'' +
                ", ekranBoyutu=" + ekranBoyutu +
                ", dizustuMu=" + dizustuMu +
                ", ramKapasitesi=" + ramKapasitesi +
                ", harddiskKapasitesi=" + harddiskKapasitesi +
                ", ssdVar=" + ssdVar +
                '}';
    }
}
