package com.company.databases;

import com.company.interfaces.Database;

public class MySql implements Database {
    @Override
    public void login() {
        System.out.println("Mysql veri tabanına bağlandım...");
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void get() {

    }

    @Override
    public void update() {

    }
}
