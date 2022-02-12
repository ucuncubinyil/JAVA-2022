package com.company;

public enum HaftaninGunleri {

    PAZARTESİ("PZT"),
    SALI("SL"),
    ÇARŞAMBA("CRS"),
    PERŞEMBE("PSB"),
    CUMA("CM"),
    CUMARTESİ("CMTS"),
    PAZAR("PZ");

    private String deger;

    HaftaninGunleri(String deger) {
        this.deger = deger;
    }

    public String getDeger() {
        return deger;
    }
}
