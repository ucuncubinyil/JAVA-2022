package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DosyaOkumaFileInputStream {

    public static void main(String[] args) {


        String okunanVeri = null;

        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");


        FileInputStream fileInputStream;

        System.out.println(dosya.length());
        System.out.println(dosya.canRead());
        System.out.println(dosya.exists());
        System.out.println(dosya.canExecute());

        byte veriler[] = new byte[(int) dosya.length()];


        try {
            fileInputStream = new FileInputStream(dosya);
            fileInputStream.read(veriler);
            okunanVeri = new String(veriler);
            System.out.println(okunanVeri);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
