package com.company;

import java.io.*;

public class DosyaOkumaBuffeeredInputStream {

    public static void main(String[] args)  {

        String okunanVeri = null;
        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");

        byte veriDizisi[] = new byte[(int) dosya.length()];
        int okumaSayisi = 0;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;

        try {
            fileInputStream = new FileInputStream(dosya);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            while ((okumaSayisi = bufferedInputStream.read(veriDizisi)) != -1) {
                okunanVeri = new String(veriDizisi, 0, okumaSayisi);
                System.out.println(okunanVeri);

            }
            bufferedInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
