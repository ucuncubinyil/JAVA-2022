package com.company;

public class Mudur extends Calisan{

    @Override
    public void soyAdiniSoyle() {

        System.out.println("Merhaba, soyAdım: " + super.getSurName());
    }

    @Override
    public void adiniSoyle() {
        System.out.println(super.getName());
    }

    @Override
    public String toString() {
        return "Adı: " + super.getName() + " " +
                "Soyadı: "+ super.getSurName();
    }

}
