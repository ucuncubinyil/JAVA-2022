
import mehmet.Araba;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        domain.Araba araba = new domain.Araba("Kırmızı", "Audi", "A30");
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Lütfen Arabanın Markasını Giriniz:");
//        araba.markasi = scanner.nextLine();
//
//        System.out.println("Lütfen Arabanın Modeli Giriniz:");
//        araba.modeli = scanner.nextLine();

//        System.out.println("Lütfen Arabanın Rengini Giriniz:");
//        araba.rengi = scanner.nextLine();

//        System.out.println("Lütfen Arabanın Üretim Yılını Giriniz:");
//        araba.uretimYili = scanner.nextInt();
//
//        System.out.println("Lütfen Arabanın Motor Hacmini Giriniz:");
//        araba.motorHacmi = scanner.nextInt();
//
//        System.out.println("Lütfen Arabanın Kapı Sayısını Giriniz:");
//        araba.kapiSayisi = scanner.nextInt();
//
//        System.out.println("Lütfen Arabanın Çekiş Sayısını Giriniz:");
//        araba.cekisSayisi = scanner.nextInt();
//
//
//        System.out.println("#####################   ARABANIN ÖZELLİKLERİ   #####################");
//        System.out.println("Arabanın Markası : " + araba.markasi);
//        System.out.println("Arabanın Modeli : " + araba.modeli);
//        System.out.println("Arabanın Rengi : " + araba.rengi);
//        System.out.println("Arabanın Üretim Yılı : " + araba.uretimYili);
//        System.out.println("Arabanın Motor Hacmi: " + araba.motorHacmi);
//        System.out.println("Arabanın Kapı Sayısı: " + araba.kapiSayisi);
//        System.out.println("Arabanın Çekiş Sayısı: " + araba.cekisSayisi);


//        domain.Araba audi = new domain.Araba(2022, "Kırmızı");

//        System.out.println("#####################   ARABANIN ÖZELLİKLERİ   #####################");
//        System.out.println("Arabanın Markası : " + audi.markasi);
//        System.out.println("Arabanın Modeli : " + audi.modeli);
//        System.out.println("Arabanın Rengi : " + audi.rengi);
//        System.out.println("Arabanın Üretim Yılı : " + audi.uretimYili);
//        System.out.println("Arabanın Motor Hacmi: " + audi.motorHacmi);
//        System.out.println("Arabanın Kapı Sayısı: " + audi.kapiSayisi);
//        System.out.println("Arabanın Çekiş Sayısı: " + audi.cekisSayisi);

//
//        List<Araba> arabaList = new ArrayList<>();
//
//
//        Araba mehmetinArabasi = new Araba("Audi", "Gri", "A3");
//        mehmetinArabasi.kapiSayisi = 4;
//        mehmetinArabasi.uretimYili = 2019;
//        mehmetinArabasi.motorHacmi =2400;
//        mehmetinArabasi.cekisSayisi = 4;
//        arabaList.add(mehmetinArabasi);
//
//
//
//        murat.Araba muratinArabasi = new murat.Araba();
//        muratinArabasi.markasi = "BMW";
//        muratinArabasi.rengi = "Mavi";
//        muratinArabasi.modeli = "3.20x";
//        muratinArabasi.cekisSayisi = 4;
//        muratinArabasi.kapiSayisi = 2;
//        muratinArabasi.motorHacmi = 3600;


//
//        for (domain.Araba araba : arabaList) {
//            if (araba.kapiSayisi == 2) {
//                System.out.println("Adam zengin");
//                break;
//            }
//            System.out.println(araba);
//        }


        Araba bosCont = new Araba();
        bosCont.setMarkasi("Audi");
        bosCont.setModeli("a3");
        bosCont.setKapiSayisi(4);
        bosCont.setUretimYili(2021);
        bosCont.setRengi("Mor");
        bosCont.setGaranti(true);
        bosCont.setNavigasyon(false);

        Araba ikiContr = new Araba(1600, 4, 2021);
        ikiContr.setNavigasyon(true);
        ikiContr.setMarkasi("BMW");
        ikiContr.setModeli("i7");
        ikiContr.setRengi("Turuncu");
        ikiContr.setGaranti(false);

        List<Araba> arabaList = new ArrayList<>();
        arabaList.add(bosCont);
        arabaList.add(ikiContr);

        for (Araba araba : arabaList) {
            System.out.println(araba);
        }

    }
}
