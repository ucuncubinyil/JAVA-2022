package com.mehmetnuri;

import com.mehmetnuri.abfirmasi.Hizmetli;
import com.mehmetnuri.abfirmasi.Mudur;
import com.mehmetnuri.abfirmasi.Personel;
import com.mehmetnuri.ders.Fizik;
import com.mehmetnuri.meyve.Muz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//
//        Kedi kedi = new Kedi();
//        kedi.hayvaninSesiniCikar();

//        double ekmekFiyati;
//
//        SuperMarketHesaplayici hesaplayici = new SuperMarketHesaplayici();
//
//        ekmekFiyati = hesaplayici.ekmekSatinAl(2);
//        System.out.println(ekmekFiyati);

//        Muhendis muhendis = new Muhendis();
//        System.out.println(muhendis.getAd());

//        Muz muz = new Muz();
//        muz.setAdi("Muz");
//        muz.setFiyati(10.50);
//        muz.setRengi("Sarı");
//        muz.ozellik("Mor", 11.50);
//        System.out.println(muz.meyveAdi());
//
//        Fizik fizik = new Fizik();
//        fizik.setSinifNo(6);
//        System.out.println(fizik.getSinifNo());
//        System.out.println(fizik.getAdi());

        List<Personel> personelList = new ArrayList<>();

        Mudur mudur = new Mudur();
        mudur.setAdSoyad("Halil Kahraman");
        mudur.setYasi(32);
        if (mudur.getYasi() > 40) {
            mudur.setEkGosterge(3 / 1);
        } else {
            mudur.setEkGosterge(3/2);
        }
        personelList.add(mudur);
        System.out.println(mudur);

        Hizmetli hizmetli = new Hizmetli();
        hizmetli.setAdSoyad("Ahmet Yıldırım");
        hizmetli.setYasi(56);

        double hizmetliMaasi = hizmetli.MaasHesapla();
        System.out.println(hizmetliMaasi);

        personelList.add(hizmetli);

        for (Personel personel : personelList) {
            System.out.println("Personel Ad Soyad:" + personel.getAdSoyad());
            System.out.println("Personel Maaş : " + personel.MaasHesapla());
            System.out.println("Kat sayı ortak  özellik olmadığından yazdırılamaz ");
            System.out.println("Personel Yaşı:" + personel.getYasi());
        }


    }
}
