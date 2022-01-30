package com.company.databases;

import com.company.interfaces.Database;

public class PostgreSQL implements Database {
    @Override
    public void login() {
        System.out.println("PostgreSQL veritabanına bağlandım");
    }

    @Override
    public void add() {
        System.out.println("Veri postgresql veritabanına eklendi");
    }

    @Override
    public void delete() {
        System.out.println("Veri postgresql veritabanından silindi");

    }

    @Override
    public void get() {
        System.out.println("Veri postgresql veritabanından getirildi");
    }

    @Override
    public void update() {
        System.out.println("Veri postgresql veritabanında güncellendi");
    }

    public void haritaBilgisiniGetir() {
        System.out.println("Harita bilgileri");
    }
}
