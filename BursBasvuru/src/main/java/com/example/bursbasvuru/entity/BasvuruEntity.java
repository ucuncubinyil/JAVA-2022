package com.example.bursbasvuru.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class BasvuruEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basvuru_seq")
    private Long id;

    @ManyToOne
    private OgrenciEntity ogrenci;

    @ManyToOne
    private KurumEntity kurum;

    @Temporal(TemporalType.TIMESTAMP)
    private Date bitisTarihi;

    @Temporal(TemporalType.TIMESTAMP)
    private Date basvuruTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OgrenciEntity getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(OgrenciEntity ogrenci) {
        this.ogrenci = ogrenci;
    }

    public KurumEntity getKurum() {
        return kurum;
    }

    public void setKurum(KurumEntity kurum) {
        this.kurum = kurum;
    }

    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public Date getBasvuruTarihi() {
        return basvuruTarihi;
    }

    public void setBasvuruTarihi(Date basvuruTarihi) {
        this.basvuruTarihi = basvuruTarihi;
    }
}
