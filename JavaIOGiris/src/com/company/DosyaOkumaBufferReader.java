package com.company;

import java.io.*;

public class DosyaOkumaBufferReader {

    public static void main(String[] args) {

        String okunanVeriler = null;

        File dosya = new File("D:\\MEHMET_NURI\\deneme.txt");

        FileReader reader;
        BufferedReader bufferedReader;

        try {
            reader = new FileReader(dosya);
            bufferedReader = new BufferedReader(reader);
            okunanVeriler = bufferedReader.readLine();
            System.out.println(okunanVeriler);
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
