package com.company;

import com.company.interfaces.IMuhendis;
import com.company.muhedisler.ElektrikMuhendisi;
import com.company.muhedisler.PCMuhendisi;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PCMuhendisi pcMuhendisi = new PCMuhendisi(true, false);
        pcMuhendisi.adliSicilKaydiSorgula();
        pcMuhendisi.askerlikDurumuSorgula();

        String derece = pcMuhendisi.mezuniyetOrtalamasi(3.95);
        System.out.println(derece);

        String[] tecrubeler = {"A firması", "B firması", "C firması"};
        pcMuhendisi.isTecrubesi(tecrubeler);

        IMuhendis muhendis = new PCMuhendisi(true, true);
        muhendis.adliSicilKaydiSorgula();
        muhendis.askerlikDurumuSorgula();
        String derece1 = muhendis.mezuniyetOrtalamasi(2.60);
        System.out.println(derece1);
        String[] tecrubeler2 = {"A firması"};
        muhendis.isTecrubesi(tecrubeler2);

        ElektrikMuhendisi elektrikMuhendisi = new ElektrikMuhendisi();
        elektrikMuhendisi.setAskerlik(true);
        elektrikMuhendisi.setSicilKaydi(false);
        elektrikMuhendisi.askerlikDurumuSorgula();
        elektrikMuhendisi.adliSicilKaydiSorgula();
        String derece2 = elektrikMuhendisi.mezuniyetOrtalamasi(3.65);
        System.out.println(derece2);
        String[] array = {"B Firması"};
        elektrikMuhendisi.isTecrubesi(array);

        IMuhendis iMuhendis = new ElektrikMuhendisi();
        ((ElektrikMuhendisi) iMuhendis).setAskerlik(true);
        iMuhendis.askerlikDurumuSorgula();

        IMuhendis iMuhendis2 = new ElektrikMuhendisi(true, true);
        iMuhendis2.askerlikDurumuSorgula();
    }
}
