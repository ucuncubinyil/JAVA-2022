import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int i = 10;
//        while ( 0 <  i) {
//            i--;
//            System.out.println(i);
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen bir sayı giriniz:");
//        int i = scanner.nextInt();
//
//        while (0 < i) {
//            System.out.println(i);
//            i -=2;
//        }


//        Scanner scanner = new Scanner(System.in);
//        int toplam = 0;
//        int i = 0;
//        System.out.println("Lütfen bir sayı girin");
//        int n = scanner.nextInt();
//
//        while (n >= i) {
//            toplam += i;
//            i++;
//        }
//
//        System.out.println("Toplam "+ toplam);


//        Scanner scanner = new Scanner(System.in);
//        int fakt = 1;
//        System.out.println("Lütfen bir sayı giriniz :");
//        int n = scanner.nextInt();
//        while (n > 0) {
//            fakt *= n;
//            n--;
//        }
//
//        System.out.println(fakt);

        Scanner scanner = new Scanner(System.in);
        int n;
        int basamak = 1;
        System.out.println("Lütfen bir sayı giriniz:");
        n = scanner.nextInt();
        while (n >= 10) {
            n = n / 10;
            basamak++;
        }
        System.out.println(n + " sayısı " + basamak + " basamaklıdır");
    }
}
