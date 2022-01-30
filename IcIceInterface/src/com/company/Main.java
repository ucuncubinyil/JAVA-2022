package com.company;

import com.company.iciceornek1.Yazdir;
import com.company.iciceornek1.interfaces.Nested;
import com.company.iciceornek2.AracTur;
import com.company.iciceornek2.Minibus;
import com.company.iciceornek2.Otomobil;
import com.company.iciceornek3.Kare;
import com.company.iciceornek3.Kup;

public class Main {

    public static void main(String[] args) {

      /*  Yazdir yazdir = new Yazdir();
        yazdir.goster();

        Nested.Gel nested = new Yazdir();
        nested.goster();*/
/*
        Otomobil otomobil = new Otomobil();
        otomobil.getMotorGucu();
        otomobil.getYolcuSayisi();

        Minibus minibus = new Minibus();
        minibus.getYolcuSayisi();*/

        Kare kare = new Kare();
        kare.hesapla(2);

        Kup kup = new Kup();
        kup.hesapla(2);

    }
}
