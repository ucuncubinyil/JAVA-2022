package com.mehmetnuri.emir;

public class Papatya extends Bitki{

    private Long yaprakSayisi;
    private String yaprakRengi;
    private String tacRengi;

    public Papatya() {
    }

    public Long getYaprakSayisi() {
        return yaprakSayisi;
    }

    public void setYaprakSayisi(Long yaprakSayisi) {
        this.yaprakSayisi = yaprakSayisi;
    }

    public String getYaprakRengi() {
        return yaprakRengi;
    }

    public void setYaprakRengi(String yaprakRengi) {
        this.yaprakRengi = yaprakRengi;
    }

    public String getTacRengi() {
        return tacRengi;
    }

    public void setTacRengi(String tacRengi) {
        this.tacRengi = tacRengi;
    }

    @Override
    public String toString() {
        return "Papatya{" +
                "kokTuru=" + getKokTuru() +
                "yaprakliMi="+ isYaprakliMi()+ '\'' +
                "cicekliMi="+ isCicekliMi()+ '\'' +
                "yaprakSayisi=" + yaprakSayisi +
                ", yaprakRengi='" + yaprakRengi + '\'' +
                ", tacRengi='" + tacRengi + '\'' +
                '}';
    }
}

