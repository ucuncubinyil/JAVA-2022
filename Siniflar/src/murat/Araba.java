package murat;

public class Araba {

    String rengi;
    String markasi;
    String modeli;
    int uretimYili;
    int kapiSayisi;
    int motorHacmi;
    int cekisSayisi;

    public Araba() {
    }

    public Araba(String rengi, String markasi, String modeli) {
        this.rengi = rengi;
        this.markasi = markasi;
        this.modeli = modeli;
    }

    public Araba(int uretimYili, String rengi) {
        this.uretimYili = uretimYili;
        this.rengi = rengi;
    }

    public String arabaninModeliniYaz() {
        return this.modeli;
    }

    @Override
    public String toString() {
        return "domain.Araba{" +
                "rengi='" + rengi + '\'' +
                ", markasi='" + markasi + '\'' +
                ", modeli='" + modeli + '\'' +
                ", uretimYili=" + uretimYili +
                ", kapiSayisi=" + kapiSayisi +
                ", motorHacmi=" + motorHacmi +
                ", cekisSayisi=" + cekisSayisi +
                '}';
    }
}
