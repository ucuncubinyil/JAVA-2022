package com.mehmetnuri.oopuygulama2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Telefon iPhone = new Telefon();
        iPhone.setBataryaKapasitesi(5300);
        iPhone.setCekirdekSayisi(8);
        iPhone.setKamera(true);
        iPhone.setRengi("Uzay Grisi");
        iPhone.setBesGDurumu(true);

        System.out.println(iPhone);

        Buzdolabi arcelik = new Buzdolabi(2021, "Asjslk22","Arçelik",
                2, 500,false);

        System.out.println(arcelik);


        Bilgisayar msi = new Bilgisayar();
        msi.setCigdemSayisi(16);
        msi.setDizustuMu(true);
        msi.setEkranBoyutu(14.5);
        msi.setHarddiskKapasitesi(1024000);
        msi.setRamKapasitesi(16384);
        msi.setSsdVar(true);
        msi.setModeli("CX2022");
        msi.setUretimYili(2019);

        System.out.println(msi);

        Bilgisayar casper = new Bilgisayar(2018, 4, "CAS2");
        casper.setHarddiskKapasitesi(1024000);
        casper.setSsdVar(false);
        casper.setRamKapasitesi(16384);
        casper.setDizustuMu(false);
        casper.setEkranBoyutu(16.0);

        System.out.println(casper);


        Bilgisayar monster = new Bilgisayar(2018, 8, "ABS2", 14.3, true,
                16384, 102400, false);

        System.out.println(monster);


        Hayvan kedi = new Hayvan();
        kedi.setYas(1);
        kedi.setAyakSayısı(4);
        kedi.setCinsi("Tekir");
        kedi.setBeslenme(true);
        kedi.setDeriRengi("Siyah Sarı");
        kedi.setTuy(true);
        kedi.setSes("Miav");
        kedi.setKanat(false);
        kedi.setCinsiyet(false);

        System.out.println(kedi);


        Hayvan kopek = new Hayvan(4,true,"Golden");
        kopek.setKanat(false);
        kopek.setSes("Hav hav");
        kopek.setTuy(true);
        kopek.setDeriRengi("Altın Sarısı");
        kopek.setAyakSayısı(4);
        kopek.setBeslenme(true);
        System.out.println(kopek);

        Hayvan marti = new Hayvan(1, false, "Martı", 2,"Gak","Beyaz",
                true,true,true);

        System.out.println(marti);

        List<Hayvan> hayvanListesi = new ArrayList<>();
        hayvanListesi.add(kedi);
        hayvanListesi.add(kopek);
        hayvanListesi.add(marti);

        for (Hayvan hayvan : hayvanListesi) {
            System.out.println(hayvan.getSes());
        }
    }
}
