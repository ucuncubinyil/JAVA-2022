import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1 ile 12 arasında bir değer giriniz");
//        int girilenDeger = scanner.nextInt();
//
//
//        switch (girilenDeger) {
//            case 1:
//                System.out.println("Ocak Ayı");
//                break;
//            case 2:
//                System.out.println("Şubat");
//                break;
//            case 3:
//                System.out.println("Mart");
//                break;
//            case 4:
//                System.out.println("Nisan");
//                break;
//            case 5:
//                System.out.println("Mayıs");
//                break;
//            case 6:
//                System.out.println("Haziran");
//                break;
//            case 7:
//                System.out.println("Temmuz");
//            case 8:
//                System.out.println("Ağustos");
//                break;
//            case 9:
//                System.out.println("Eylül");
//                break;
//            case 10:
//                System.out.println("Ekim");
//                break;
//            case 11:
//                System.out.println("Kasım");
//                break;
//            case 12:
//                System.out.println("Aralık");
//                break;
//            default:
//                System.out.println("Tanımsız");
//                break;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int n,y;
//        String secenekler = "Toplama işlemi için 1 \n" +
//                "Çıkarma için 2 \n" +
//                "Çarpma işlemi için 3\n" +
//                "Bölme işkemi için 4 ' e basınız";
//        System.out.println(secenekler);
//        System.out.println("İşlem seçiniz :");
//
//        String secenek = scanner.nextLine();
//
//        switch (secenek) {
//            case "1":
//                System.out.println("Birinci sayıyı giriniz:");
//                n = scanner.nextInt();
//                System.out.println("İkinci sayıyı giriniz:");
//                y = scanner.nextInt();
//                System.out.println( n + " sayısının " +  y + " sayısı ile toplamı : " + (n+y));
//                break;
//            case "2":
//                System.out.println("Birinci sayıyı giriniz:");
//                n = scanner.nextInt();
//                System.out.println("İkinci sayıyı giriniz:");
//                y = scanner.nextInt();
//                System.out.println( n + " sayısının " +  y + " sayısından çıkarılması ile çıkan sonuç : " + (n-y));
//                break;
//            case "3":
//                System.out.println("Birinci sayıyı giriniz:");
//                n = scanner.nextInt();
//                System.out.println("İkinci sayıyı giriniz:");
//                y = scanner.nextInt();
//                System.out.println( n + " sayısının " +  y + " çarpılması ile  çıkan sonuç : " + (n*y));
//                break;
//            case "4":
//                System.out.println("Birinci sayıyı giriniz:");
//                n = scanner.nextInt();
//                System.out.println("İkinci sayıyı giriniz:");
//                y = scanner.nextInt();
//                System.out.println( n + " sayısının " +  y + " sayısına bölünemesinden çıkan sonu. : " + (n/y));
//                break;
//            default:
//                System.out.println("Lütfen geçerli bir seçenek seçiniz!!!");
//                break;
//        }

//        Math.sqrt(n)
//        Math.pow(y, z)

        Scanner scanner = new Scanner(System.in);

        String secenekler = "Karekök işlemi için 1 \n" +
                "Üs işlemi için 2 \n" +
                "Kare alma işlemi için 3 ü seçiniz";
        System.out.println(secenekler);

        String secenek = scanner.nextLine();

        switch (secenek) {
            case "1":
                System.out.println("Lütfen karekökü alınacak sayıyı giriniz:");
                int karakokSayi = scanner.nextInt();
                System.out.println(karakokSayi +" sayısının karekökü " + Math.sqrt(karakokSayi));
                break;
            case "2":
                System.out.println("Lütfen üssü alınacak sayıyı giriniz :");
                int ussuAlinacakSayi = scanner.nextInt();
                System.out.println("Sayının kaçıncı üssü alınacak");
                int us = scanner.nextInt();
                System.out.println(ussuAlinacakSayi + " sayının " + us + " ussu:" + Math.pow(ussuAlinacakSayi, us));
                break;
            case "3":
                System.out.println("Lütfen karesi alınacak sayıyı giriniz:");
                int karesiAlinacakSayi = scanner.nextInt();
                System.out.println( karesiAlinacakSayi + " sayisinin karesi "+ (karesiAlinacakSayi*karesiAlinacakSayi));
                break;
            default:
                System.out.println("Lütfen geçerli bir seçenek seçiniz");

        }
    }
}
