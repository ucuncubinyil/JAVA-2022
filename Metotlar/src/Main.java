import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int yazili1, yazili2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1. yazılı notunu gir: ");
        yazili1 = scanner.nextInt();
        System.out.println("Lütfen 2. yazılı notunu gir: ");
        yazili2 = scanner.nextInt();

        hesapla(yazili1, yazili2);

        String ogrenciAdi;

        int ahmetinVizesi =  15;
        int ahmetinFinali = 62;
        ogrenciAdi = "Ahmet";
        vizeOrtalama(ogrenciAdi,ahmetinVizesi, ahmetinFinali);

        int mehmetinVizesi =  65;
        int mehmetinFinali = 95;
        ogrenciAdi = "Mehmet";
        vizeOrtalama(ogrenciAdi,mehmetinVizesi, mehmetinFinali);

        int sayi1 = 21;
        int sayi2 = 33;
        int carpim = carpmaIslemiYap(sayi1, sayi2);

        int ikiKare = ikiNinKaresi();

        System.out.println(ikiKare);

        System.out.println(carpim);


    }

    public static void hesapla( int a, int b) {
        double ortalama = (a + b) / 2;
        System.out.println("Ortalamanız : " + ortalama);
    }

    public static void vizeOrtalama(String ogrenciAdi,int a, int b) {
        double ortalama = (a * 0.4) + (b * 0.6);
        System.out.println("Öğrenci Adı:" + ogrenciAdi);
        System.out.println("Ortalamanız : " + ortalama);
    }

    public static int carpmaIslemiYap(int a, int b) {
        return a * b;
    }

    public static int ikiNinKaresi() {
        return 2 * 2;
    }

    public static String egitmenAdi() {

        String adim = "Mehmet";
        return adim;
    }
}
