package com.company;

import com.company.enums.EnumGecmeDurumlari;
import com.company.enums.Ogrenci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final int BASARILI = 1;
    private static final int BASARISIZ = 0;


    public static void main(String[] args) {

        Ogrenci mehmet = new Ogrenci();
        mehmet.setAd("Mehmet");
        mehmet.setSoyAd("Öztürk");
        int birinciNot;
        int ikinciNot;
        int ucuncuNot;
        double ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen birinci sınav notunuzu giriniz: ");
        birinciNot = scanner.nextInt();

        System.out.println("Lütfen ikinci sınav notunuzu giriniz: ");
        ikinciNot = scanner.nextInt();

        System.out.println("Lütfen üçüncü sınav notunuzu giriniz: ");
        ucuncuNot = scanner.nextInt();
        ortalama = (birinciNot + ikinciNot + ucuncuNot) / 3;

        if (ortalama >= 85) {
            mehmet.setGecmeDurumu(EnumGecmeDurumlari.BASARILI);
        }else{
            mehmet.setGecmeDurumu(EnumGecmeDurumlari.BASARISIZ);
        }

        System.out.println(mehmet);

        List<Ogrenci> ogrenciList = new ArrayList<>();
        ogrenciList.add(mehmet);

        for (Ogrenci ogrenci : ogrenciList) {
            System.out.println("Öğrenci Ad: " + ogrenci.getAd());
            System.out.println("Öğrenci Soyad: " + ogrenci.getSoyAd());
            System.out.println("Öğrenci Geçme Durumu : " + ogrenci.getGecmeDurumu().getDisplayValue());
        }
    }
}
