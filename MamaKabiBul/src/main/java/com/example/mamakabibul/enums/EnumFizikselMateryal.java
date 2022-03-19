package com.example.mamakabibul.enums;

public enum EnumFizikselMateryal {
    AHSAP("Ahşap"),
    DEMIR("Demir"),
    PLASTIK("Plastik"),
    KARTON("Karton");

    private final String fizikselMateryal;

    EnumFizikselMateryal(String fizikselMateryal) {
        this.fizikselMateryal = fizikselMateryal;
    }
}
