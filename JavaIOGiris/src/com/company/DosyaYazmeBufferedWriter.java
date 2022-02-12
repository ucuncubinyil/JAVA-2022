package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DosyaYazmeBufferedWriter {

    public static void main(String[] args) {

        String okunanVeri = null;
        String yazdirilacakDeger = "Merhaba ben java tarafından File output stream yöntmiyle yazdırıldım";

        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");
        BufferedWriter bufferedWriter;


        try {
            FileWriter fw = new FileWriter(dosya);
            bufferedWriter = new BufferedWriter(fw);
            bufferedWriter.write("Merhaba ben Buffer writer yöntemiyle yazdırıldım");
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
