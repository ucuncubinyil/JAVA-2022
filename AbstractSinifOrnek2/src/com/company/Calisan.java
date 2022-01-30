package com.company;

public abstract class Calisan {

    private String name;
    private String surName;

    public void adiniSoyle() {
        System.out.println("Merhaba, benim adım: " + this.name);
    }

    public abstract void soyAdiniSoyle();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


}
