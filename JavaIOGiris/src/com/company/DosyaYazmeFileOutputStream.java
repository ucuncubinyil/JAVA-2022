package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DosyaYazmeFileOutputStream {

    public static void main(String[] args) {

        String okunanVeri = null;
        String yazdirilacakDeger = "Merhaba ben java tarafından File output stream yöntmiyle yazdırıldım";

        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");
        FileOutputStream fileOutputStream;
        FileReader fileReader;

        try {
            fileOutputStream = new FileOutputStream(dosya);

            byte byteVeriler[] = yazdirilacakDeger.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(byteVeriler);
            fileOutputStream.close();

            System.out.println(yazdirilacakDeger.getBytes(StandardCharsets.UTF_8));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
