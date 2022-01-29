package com.mehmetnuri.mehmet;

public class TarimKredisi extends KrediTurleri{

    @Override
    public double OdenecekTutar() {
        return getKrediTutari() + ( getKrediTutari() / getTaksitSayisi()) * getFaizOrani() * 12L;
    }
}
