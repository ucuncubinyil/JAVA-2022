package com.example.bursbasvuru.entity;

import javax.persistence.*;

@Entity
@Table
public class OkulEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "okul_seq")
    private Long id;

    private String adi;

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
}
