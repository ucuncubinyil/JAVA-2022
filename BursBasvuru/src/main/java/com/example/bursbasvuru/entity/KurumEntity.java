package com.example.bursbasvuru.entity;


import javax.persistence.*;

@Entity
@Table
public class KurumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kurum_seq")
    private Long id;

    private String kurumAdi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKurumAdi() {
        return kurumAdi;
    }

    public void setKurumAdi(String kurumAdi) {
        this.kurumAdi = kurumAdi;
    }
}
