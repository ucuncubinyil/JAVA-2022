package com.mehmtnuri;

public class Telefon {

    private Integer id;
    private String modeli;

    public Telefon() {
    }

    public Telefon(Integer id, String modeli) {
        this.id = id;
        this.modeli = modeli;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "id=" + id +
                ", modeli='" + modeli + '\'' +
                '}';
    }
}
