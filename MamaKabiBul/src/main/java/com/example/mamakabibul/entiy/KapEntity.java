package com.example.mamakabibul.entiy;

import com.example.mamakabibul.enums.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "kaplar")
public class KapEntity {

    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "kaplar_seq")
    private Long id;

    @Version
    private Long version;

    @Length(min = 5, max = 30, message = "Bu alana 5 hadeneden küçük 30 haneden büyük değer giremezsiniz")
    private String adi;

    @Column
    private String aciklama;

    @Enumerated(EnumType.STRING)
    private EnumMamaTipi mamaTipi;

    @Enumerated(EnumType.STRING)
    private EnumDurumAP kapDurumu;

    @Enumerated(EnumType.STRING)
    private EnumTemizlikDurumu temizlikDurumu;

    @Enumerated(EnumType.STRING)
    private EnumFizikselDurum fizikselDurum;

    @Enumerated(EnumType.STRING)
    private EnumFizikselMateryal fizikselMateryal;

    @Enumerated(EnumType.STRING)
    private EnumKapTipi tipi;

    @Column
    private Double lat;

    @Column
    private Double lng;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public EnumMamaTipi getMamaTipi() {
        return mamaTipi;
    }

    public void setMamaTipi(EnumMamaTipi mamaTipi) {
        this.mamaTipi = mamaTipi;
    }

    public EnumDurumAP getKapDurumu() {
        return kapDurumu;
    }

    public void setKapDurumu(EnumDurumAP kapDurumu) {
        this.kapDurumu = kapDurumu;
    }

    public EnumTemizlikDurumu getTemizlikDurumu() {
        return temizlikDurumu;
    }

    public void setTemizlikDurumu(EnumTemizlikDurumu temizlikDurumu) {
        this.temizlikDurumu = temizlikDurumu;
    }

    public EnumFizikselDurum getFizikselDurum() {
        return fizikselDurum;
    }

    public void setFizikselDurum(EnumFizikselDurum fizikselDurum) {
        this.fizikselDurum = fizikselDurum;
    }

    public EnumFizikselMateryal getFizikselMateryal() {
        return fizikselMateryal;
    }

    public void setFizikselMateryal(EnumFizikselMateryal fizikselMateryal) {
        this.fizikselMateryal = fizikselMateryal;
    }

    public EnumKapTipi getTipi() {
        return tipi;
    }

    public void setTipi(EnumKapTipi tipi) {
        this.tipi = tipi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
