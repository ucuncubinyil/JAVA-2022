package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ilce> ilceList = new ArrayList<>();

        Il malatya = new Il();
        malatya.setAdi("Malatya");
        malatya.setId(44L);


        Ilce akcadag = new Ilce();
        akcadag.setId(2L);
        akcadag.setName("Akçadağ");
        akcadag.setIl(new Il(1L, "Malattysa"));

        ilceList.add(akcadag);

        for (Ilce ilce : ilceList) {

            if (ilce.getIl().getId() == 44L) {
                System.out.println("Malatyanın ilçesidir");
            }
            System.out.println(ilce);
        }
    }
}
