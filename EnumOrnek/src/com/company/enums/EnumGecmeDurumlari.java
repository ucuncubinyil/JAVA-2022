package com.company.enums;

public enum EnumGecmeDurumlari {

    BASARILI("Başarılı"),
    BASARISIZ("Başarısız");

    private String displayValue;

    EnumGecmeDurumlari(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
