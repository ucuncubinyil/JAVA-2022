package com.example.bursbasvuru.enums;

public enum EnumCinsiyet {
    ERKEK("Erkek"),
    KADIN("Kadın"),
    DIGER("Diğer");

    private final String cinsiyet;

    EnumCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
