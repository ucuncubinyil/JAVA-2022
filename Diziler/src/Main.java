import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Diziler
//
//        int[] dizi1 = new int[2];
//        dizi1[0] = 1;
//        dizi1[1] = 2;
//
//        System.out.println(dizi1[0]);
//        System.out.println(dizi1[1]);

//
//        int dizi[] = {1,2,3,4,5};
//        System.out.println(dizi[1]);
//
//        String dizi2[] = {"Murat", "Selin"};
//        System.out.println(dizi2[1]);
//
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println(dizi[i]);
//        }
//
//        for (int i : dizi) {
//            System.out.println(i);
//        }

//        Random rnd = new Random();
//        int[] dizi = new int[]{rnd.nextInt(100)};
//
//        //Dizi uzunluğu  öğrenme
//        System.out.println("Dizinin uzunluğu: " + dizi.length);
//        System.out.println(dizi[0]);

//        int dizi[] = new int[10];
//        dizi = new int[]{3,4,5,6,2,3,1,2,10,15,19};
//        System.out.println("Dizi uzunluğu : "+ dizi.length);
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println(dizi[i]);
//        }
//
//        String stringDizi[] = new String[4];
//        stringDizi = new String[]{"Ahmet", "Mehmet", "Kemal", "Mustafa"};
//
//        for (int i = 0; i < stringDizi.length; i++) {
//            System.out.println(stringDizi[i]);
//        }

//        int[] sayilar = new int[]{3,6,9,4,57,68,12,35,78,63};

//        // Tek sayıları bulan for döngüsü
//        for (int i : sayilar) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        //Çift sayıları bulan döngü
//        for (int i : sayilar) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        Object dizi[] = new Object[5];
//
//        dizi[0] = "Mustafa";
//        dizi[1] = 35;
//        dizi[2] = "Mavi";
//        dizi[3] = 44;
//        dizi[4] = 36.5;
//
//        for (Object o : dizi) {
//            System.out.println(o);
//        }
//
//        for (int i = 0; i < dizi.length; i++) {
//            System.out.println(dizi[i]);
//        }

//        int[] kopyalanacakDizi = new int[]{1, 2, 3, 4, 5, 6};
//        System.out.println("kopyalanacakDizi nin boyutu = " + kopyalanacakDizi.length);
//
//        int[] yeniDizi = new int[kopyalanacakDizi.length];
//        System.out.println("yeniDizi nin  boyutu = " + yeniDizi.length);
//
//        System.out.println("Dizi kopyalanıyor");
//        System.arraycopy(kopyalanacakDizi,0, yeniDizi,0,6);
//
//
//        for (int i = 0; i < yeniDizi.length; i++) {
//            System.out.println(yeniDizi[i]);
//        }
//
//        for (int i : yeniDizi) {
//            System.out.println(i);
//        }


        String[] stringDizisi = new String[]{"Ahmet", "Mehmet", "Yasin", "Hüseyin", "Murat", "Kemal"};
        String[] yeniDizi = new String[stringDizisi.length];

//        //1. yöntem
//        System.arraycopy(stringDizisi,0, yeniDizi,0,6);
//        for (String s : yeniDizi) {
//            System.out.println(s);
//        }
//
//
//        //2. yöntem
//        System.arraycopy(stringDizisi,0, yeniDizi,0,stringDizisi.length);
//
//        for (String s : yeniDizi) {
//            System.out.println(s);
//        }

//        int[] siralanmamisDizi = new int[]{10,4,3,2,5,8,7,6,9,1};
////        for (int i : siralanmamisDizi) {
////            System.out.println(i);
////        }
//
//        Arrays.sort(siralanmamisDizi);
//        for (int i : siralanmamisDizi) {
//            System.out.println(i);
//        }
//
//        String[] alfabetikSiralanmamisDizi = new String[]{"Mehmet","Arzu","Zeynep", "Orhun"};
//        Arrays.sort(alfabetikSiralanmamisDizi);
//        for (String s : alfabetikSiralanmamisDizi) {
//            System.out.println(s);
//        }
//
//        char[] charDizi = new char[]{'Z','B','T','J','K','M','I' };
//        Arrays.sort(charDizi);
//        for (char c : charDizi) {
//            System.out.println(c);
//        }

        //Dizi eşitlik kontrolü
//        Object[] dizi1 = {1453, "2. Mehmet", 27};
////        Object[] dizi2 = {1453, "2. Mehmet", 27};
////        Object[] dizi3 = {1685, "Barbaros Hayrettin Paşa", 65};
////
////        System.out.println(Arrays.equals(dizi1, dizi2));
////        System.out.println(Arrays.equals(dizi2, dizi3));
////
////        if (Arrays.equals(dizi1, dizi2)) {
////            System.out.println("Dizi1 Dizi2 ye eşit");
////        }
////        if (!Arrays.equals(dizi1, dizi3)) {
////            System.out.println("Dizi 1 Dizi 3 e eşit değil");
////        }

//        //Dzilerde arama
//    	int arama;//Dizide arama yapmak ve ekrana yazdırmak için değişken tanımladık.
//        int a [] = {65,66,55,88};//a dizisi içerisine sayıları girdik
//        arama = Arrays.binarySearch(a, 88);//a dizisinde 98 sayısını arattık.
//        System.out.println(arama);//ekrana yazdırdık


//        //Girilen sayının dizi içinde bulan ve ekrana basan örnek
//        int[] sayiDizisi = {2,3,6,5,4,69};
//        int arama;
//
//        int cevap;
//        System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz");
//        Scanner scanner = new Scanner(System.in);
//        cevap = scanner.nextInt();
//
//        arama = Arrays.binarySearch(sayiDizisi, cevap);
//
//        if (arama >=  0) {
//            if (arama <= sayiDizisi.length) {
//                System.out.println("Girilen sayı dizi içerisinde bulundu ve değeri: "+ sayiDizisi[arama]);
//            }
//        }else{
//            System.out.println("Girilen sayı dizi içinde bulunamadı");
//        }

        String a[][];

        a = new String[3][3];

        // Java Programlamaya Başladınız. Bu aşamada temel kavramları bitirdiniz. Artık İleri seviye başlanabilir.
//        a[0][0] = "Java";
//        a[0][1] = " Programlamlamaya";
//        a[0][2] = " Başladınız!";
//        a[1][0] = " Bu aşamada";
//        a[1][1] = " temel kavramları";
//        a[1][2] = " bitirdiniz.";
//        a[2][0] = " Artık ";
//        a[2][1] = " İleri seviye";
//        a[2][2] = " başlanabilir \n";
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(a[i][j]);
//            }
//        }


//        int b[][] = { {1,0,0,0,0}, {2,3,0,0,0},{4,5,6,0,0},{7,8,9,10,0}, {11,12,13,14,15},{2,3,6,468,46846} };
//        int i,j;
//
//        System.out.println(b[0].length);
//        for (i = 0; i < 6; i++) {
//            for (j = 0; j < 5; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }


        //Arrays.asList Metodu
//
//        String array[] = {"Ahmet", "Atilla", "Furkan"};
//        Integer array1[] = {90, 80, 90};
//
//        List listele = new ArrayList();
//        List listele1 = new ArrayList();
//        listele = Arrays.asList(array);
//        listele1 = Arrays.asList(array1);
//
//        System.out.println(listele.get(0));

        // Arrays.CopyOf Metodu

        int[] aDizisi = new int[]{15, 20, 30, 50, 90};

        System.out.println("Dizinin normal çıktısı");
        for (int i : aDizisi) {
            System.out.print(i +" ");
        }
        System.out.println();

// Arrays.copyOf yöntemi
        int[] copy = Arrays.copyOf(aDizisi, 3);
        for (int i : copy) {
            System.out.print(i + " ");
        }


// Arrays.copyOfRange metodu
        int[] kopya = Arrays.copyOfRange(aDizisi, 0, 3);
        for (int i : kopya) {
            System.out.print(i+" ");
        }
        System.out.println();

//  Arrays.fil metodu
        Arrays.fill(aDizisi, 0,3,55);

        for (int i : aDizisi) {
            System.out.print(i+" ");
        }

    }

}
