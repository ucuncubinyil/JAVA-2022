package mehmet;

public class Araba {

    private int motorHacmi;
    private int kapiSayisi;
    private int uretimYili;
    private String markasi;
    private String modeli;
    private String yakitTuru;
    private String rengi;
    private boolean navigasyon;
    private boolean garanti;

    public Araba() {
    }

    public Araba(int motorHacmi, int kapiSayisi, int uretimYili) {
        this.motorHacmi = motorHacmi;
        this.kapiSayisi = kapiSayisi;
        this.uretimYili = uretimYili;
    }

    public Araba(int motorHacmi, int kapiSayisi, int uretimYili, String markasi, String modeli, String yakitTuru,
                 String rengi, boolean navigasyon, boolean garanti) {
        this.motorHacmi = motorHacmi;
        this.kapiSayisi = kapiSayisi;
        this.uretimYili = uretimYili;
        this.markasi = markasi;
        this.modeli = modeli;
        this.yakitTuru = yakitTuru;
        this.rengi = rengi;
        this.navigasyon = navigasyon;
        this.garanti = garanti;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public void setMarkasi(String markasi) {
        this.markasi = markasi;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public void setNavigasyon(boolean navigasyon) {
        this.navigasyon = navigasyon;
    }

    public void setGaranti(boolean garanti) {
        this.garanti = garanti;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public int getUretimYili() {
        return uretimYili;
    }

    public String getMarkasi() {
        return markasi;
    }

    public String getModeli() {
        return modeli;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public String getRengi() {
        return rengi;
    }

    public boolean isNavigasyon() {
        return navigasyon;
    }

    public boolean isGaranti() {
        return garanti;
    }


    @Override
    public String toString() {
        return "Araba{" +
                "motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                ", uretimYili=" + uretimYili +
                ", markasi='" + markasi + '\'' +
                ", modeli='" + modeli + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", rengi='" + rengi + '\'' +
                ", navigasyon=" + navigasyon +
                ", garanti=" + garanti +
                '}';
    }
}
