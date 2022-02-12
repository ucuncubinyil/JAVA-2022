package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaYazmeFileWriter {

    public static void main(String[] args) {

        String okunanVeri = null;

        File yazikacakDosya = new File("D:\\MEHMET_NURI\\deneme.txt");
        FileWriter dosyaYazdir;
        FileReader dosyaOku;

        char okunanVeriler[];

        try {
            dosyaYazdir = new FileWriter(yazikacakDosya);
            dosyaYazdir.write("Merhaba ben java tarfından yazdırıldım " +
                    "\nMerhaba ben java tarfından yazdırıldım " +
                    "\nMerhaba ben java tarfından yazdırıldım \n");
            dosyaYazdir.close();

            dosyaOku = new FileReader(yazikacakDosya);
            okunanVeriler = new char[(int) yazikacakDosya.length()];
            dosyaOku.read(okunanVeriler);
            System.out.println(okunanVeriler);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
