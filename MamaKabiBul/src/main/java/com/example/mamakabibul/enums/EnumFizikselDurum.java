package com.example.mamakabibul.enums;

public enum EnumFizikselDurum {
    KIRIK("Kırık"),
    KULLANILMAZ("Kulllanılmaz"),
    SORUNSUZ("Sorunsuz");

    private final String fizikselDurum;

    EnumFizikselDurum(String fizikselDurum) {
        this.fizikselDurum = fizikselDurum;
    }
}
