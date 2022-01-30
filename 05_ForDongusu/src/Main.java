import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int i;
//
//        for (i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }

//        int i;
//
//        for (i = 1; i <= 21; i += 3) {
//            System.out.println(i +" ");
//        }

//        Scanner scanner = new Scanner(System.in);
//        int i;
//        System.out.println("Lütfen bir sayı giriniz:");
//        int n = scanner.nextInt();
//        for (i = 1; 0 <= n; i++) {
//            System.out.println(i);
//        }


//        int i, n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lütfen bir sayı giriniz");
//        n = scanner.nextInt();
//        for (i = 0; i <= n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        int i;
//        System.out.println("Lütfen bir sayı giriniz:");
//        int n = scanner.nextInt();
//        System.out.println("Bölen sayıyı giriniz:");
//        int y = scanner.nextInt();
//
//        for (i = 1; i <= n; i++) {
//            if (i % y == 0) {
//                System.out.println(i + " " + y  + " sayısına bölünebilir");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Lütfen bir sayı giriniz: ");
        x = scanner.nextInt();
        if (x < 10) {
            System.out.println("Girilen sayı 1 basamaklı");

        } else if (x < 100) {
            System.out.println("Girilen sayı 2 basamaklı ");
        } else if (x < 1000) {
            System.out.println("Girilen sayı 3 basamaklı");
        } else if (x < 10000) {
            System.out.println("Girilen sayı 4 basamaklı");

        } else if (x < 100000) {
            System.out.println("Girilen sayı 5 basamaklı");
        } else {
            System.out.println("Girilen sayı 6 basamaklı");
        }
    }
}
