package com.mehmetnuri;

import com.mehmetnuri.derya.Zara;
import com.mehmetnuri.emir.Papatya;
import com.mehmetnuri.mehmet.TarimKredisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Zara zara = new Zara();
        zara.setRengi("Mor");
        zara.setGozSayisi("5");
        zara.setMarkasi("ZARA");
        zara.setDeriMi(true);
        zara.setMensei("ABD");
        zara.setKayisiElmasMi(false);
        zara.setOtopedikMi(true);

        System.out.println(zara);
        System.out.println(zara.getRengi());

        Papatya beyazPapatya = new Papatya();
        beyazPapatya.setTacRengi("Sarı");
        beyazPapatya.setYaprakRengi("Beyaz");
        beyazPapatya.setYaprakSayisi(8L);
        beyazPapatya.setCicekliMi(true);
        beyazPapatya.setKokTuru("Kazık");
        beyazPapatya.setYaprakliMi(true);

        System.out.println(beyazPapatya);*/

//        TarimKredisi tarimKredisi = new TarimKredisi();
//        tarimKredisi.setKrediTutari(30000);
//        tarimKredisi.setFaizOrani(0.2);
//        tarimKredisi.setVadeFarkiVarMi(false);
//        tarimKredisi.setTaksitSayisi(2L);
//
//        System.out.println(tarimKredisi.OdenecekTutar());

        TarimKredisi tarimKredisi = new TarimKredisi();
        tarimKredisi.setFaizOrani(15.30);
        tarimKredisi.setVadeFarkiVarMi(true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ne kadar kredi kullanmak istediğinizi giriniz: ");
        tarimKredisi.setKrediTutari(scanner.nextDouble());

        System.out.println("Lütfen taksit sayınızı giriniz: ");
        tarimKredisi.setTaksitSayisi(scanner.nextLong());

        System.out.println(tarimKredisi.OdenecekTutar());

    }
}
