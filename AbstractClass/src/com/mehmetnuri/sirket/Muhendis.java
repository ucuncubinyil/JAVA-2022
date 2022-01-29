package com.mehmetnuri.sirket;

public class Muhendis extends Calisan{

    private String departman;
    private double puantaj;
    private boolean bilgisayarVarMi;


    public Muhendis() {
    }

    @Override
    public String getAd() {
        return "Mehmet Nuri";
    }

    @Override
    public String getSoyAd() {
        return "Öztürk";
    }
}
