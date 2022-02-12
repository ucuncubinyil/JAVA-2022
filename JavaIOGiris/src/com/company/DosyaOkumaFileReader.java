package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkumaFileReader {

    public static void main(String[] args) {

        String okunanVeri = null;
        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");
        FileReader fileReader;
        char veriler[] = new char[(int) dosya.length()]; // 12,5 12 13
        try {
            fileReader = new FileReader(dosya);
            fileReader.read(veriler);
            okunanVeri = new String(veriler);
            System.out.println(veriler);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
