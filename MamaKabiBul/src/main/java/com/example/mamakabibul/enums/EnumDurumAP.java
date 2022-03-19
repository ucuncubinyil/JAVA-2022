package com.example.mamakabibul.enums;

public enum EnumDurumAP {
    AKTIF("Aktif"),
    PASIF("Pasif");

    private final String durumAp;

    EnumDurumAP(String durumAp) {
        this.durumAp = durumAp;
    }

    @Override
    public String toString() {
        return durumAp;
    }
}
