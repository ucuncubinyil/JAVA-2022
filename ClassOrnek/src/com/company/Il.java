package com.company;

public class Il {

    private Long id;
    private String adi;

    public Il() {
    }

    public Il(Long id, String adi) {
        this.id = id;
        this.adi = adi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return adi;
    }
}
