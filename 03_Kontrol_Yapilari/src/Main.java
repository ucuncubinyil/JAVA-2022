import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         *  if(kosul){
         *  dogru ise yapılacak islem
         *  }else{
         *
         *  kosul doğru değil ise yapılacak işlem
         *  }
         *
         *
         */


//        int a = 50;
//        int b = 60;
//
//        if (a > b) {
//            System.out.println("A B den büyük");
//        }else {
//            System.out.println("A B den büyük değil ");
//        }

//        int hiz = 100;
//
//        if (hiz > 110) {
//            System.out.println("TEHLİKELİ SÜRÜŞ");
//        }else {
//            System.out.println("Sürüş normal seyirde");
//        }

//        int hiz;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Lütfen hızı giriniz: ");
//        hiz = scanner.nextInt();
//
//        if (hiz >= 120) {
//            System.out.println("Tehlikeli sürüş");
//        }else{
//            System.out.println("Hız normal");
//        }
//
//        int dogumYili;
//        int yasi;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Doğum yılınızı giriniz");
//        dogumYili = scanner.nextInt();
//
//        yasi =  2021-dogumYili;
//
//        if (yasi >= 18) {
//            System.out.println("Eğlence merkezine girebilir");
//        }else{
//            System.out.println("Giremez");
//        }


//        int girilenSayi;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Lütfen bir sayı giriniz: ");
//        girilenSayi = scanner.nextInt();
//
//        if (girilenSayi % 2 == 0) {
//            System.out.println("Girilen sayı  çift sayıdır");
//        }else {
//            System.out.println("Girilen sayı tek sayıdır");
//        }


//        int vizeNotu;
//        int finalNotu;
//        double ortalama;
//
//        System.out.println("Lütfen vize notunuzu Giriniz");
//        Scanner scanner = new Scanner(System.in);
//        vizeNotu = scanner.nextInt();
//        System.out.println("Lütfen final notunuzu Giriniz");
//        finalNotu = scanner.nextInt();
//        ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
//
//
//        if (ortalama >= 55) {
//            System.out.println("Dersten geçtin ortalaman : " + ortalama);
//        }else{
//            System.out.println("Dersten kaldın ortalama : " + ortalama);
//        }


//        Scanner scanner = new Scanner(System.in);
//        int islem;
//        double sayi1, sayi2;
//        System.out.println("Lütfen birinci sayıyı giriniz: ");
//        sayi1  =  scanner.nextDouble();
//        System.out.println("Lütfen ikinci sayıyı giriniz :");
//        sayi2 = scanner.nextDouble();
//
//        System.out.println("Çarpma işlemi için 1, bölme işlemi için 2, çıkarma işlemi için 3, toplama işlemi için 4 tuşlayınız ");
//        islem = scanner.nextInt();
//
//        if (islem == 1) {
//            System.out.println("Sonucunuz  :" + (sayi1*sayi2));
//        } else if (islem == 2) {
//            System.out.println("Sonucunuz  :" + (sayi1/sayi2));
//        } else if (islem == 3) {
//            System.out.println("Sonucunuz  :" + (sayi1-sayi2));
//        } else if (islem == 4) {
//            System.out.println("Sonucunuz  :" + (sayi1+sayi2));
//        }else{
//            System.out.println("Yanlış işlem");
//        }

//        Scanner scanner = new Scanner(System.in);
//        double kilo, boy, indeks;//Değişkenleri tanımladık.
//
//        System.out.println("Boyunuzu giriniz (Örnek: 1,70).");
//        boy = scanner.nextDouble();
//        System.out.println("Kilonuzu giriniz.");
//        kilo = scanner.nextDouble();
//
//        indeks = (kilo / (boy * boy));//indeks değişkenine beden kitle indeksi formulünü yazıyoruz.
//        if (indeks < 18.5) {//Kitle indekslerine göre koşullar tanımlıyoruz.
//            System.out.println("İndeksiniz = " + indeks + "\n" + "Zayıf");
//        } else if (indeks >= 18.5 && indeks <= 24.9) {
//            System.out.println("İndeksiniz = " + indeks + "\n" + " Normal.");
//        } else if (indeks >= 25 && indeks <= 29.9) {
//            System.out.println("İndeksiniz = " + indeks + "\n" + "Kilolu.");
//        } else if (indeks >= 30 && indeks <= 34.9) {
//            System.out.println("İndeksiniz = " + indeks + "\n" + "Obez.");
//        } else
//            System.out.println("İndeksiniz = " + indeks + "\n" + "Aşırı obez");
//


//        Scanner scanner = new Scanner(System.in);
//        double ortalama;
//        int vizeNotu, finalNotu;
//        System.out.println("Lütfen vize notunuzu giriniz:");
//        vizeNotu = scanner.nextInt();
//        System.out.println("Lütfen final notunuzu giriniz:");
//        finalNotu = scanner.nextInt();
//        ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
//
//        System.out.println("Ortalamanız  : " + ortalama);
//
//        if (ortalama >= 88 && ortalama <= 100) {
//            System.out.println("Harf notunuz AA dır");
//        } else if (ortalama >= 80 && ortalama <= 87.9) {
//            System.out.println("Harf notunuz BA dır");
//        } else if (ortalama >= 73 && ortalama <= 79.9) {
//            System.out.println("Harf notunuz BB dir");
//        } else if (ortalama >= 66 && ortalama <= 72. + 9) {
//            System.out.println("Harf notunuz CB dir");
//        } else if (ortalama >= 60 && ortalama <= 65.9) {
//            System.out.println("Harf notunuz CC dir");
//        } else if (ortalama >= 55 && ortalama >= 59.9) {
//            System.out.println("Harf notunuz DC ile şartlı geçtiniz");
//        } else if (ortalama >= 50 && ortalama <= 54.9) {
//            System.out.println("Harf notunuz DD ile şartlı geçtiniz");
//        } else if (ortalama >= 0 && ortalama <= 49.9) {
//            System.out.println("Harf notunuz FF dersten kaldınız");
//        }

        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Lütfen bir sayı girin");
        sayi = scanner.nextInt();

        if (sayi != 25 || sayi < 20) {
            System.out.println("Sayı 25 değil");
        } else {
            System.out.println("Sayı 25 e eşit");
        }


    }
}
