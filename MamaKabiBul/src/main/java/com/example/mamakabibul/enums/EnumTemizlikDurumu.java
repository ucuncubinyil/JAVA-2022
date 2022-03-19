package com.example.mamakabibul.enums;

public enum EnumTemizlikDurumu {
    KIRLI("Kirli"),
    AZ_KIRLI("Az Kirli"),
    TEMIZ("Temiz");

    private final String temizlikDurumu;

    EnumTemizlikDurumu(String temizlikDurumu) {
        this.temizlikDurumu = temizlikDurumu;
    }
}
