package com.company;

import com.company.databases.MySql;
import com.company.databases.PostgreSQL;
import com.company.manager.DatabaseManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        PostgreSQL postgreSQL = new PostgreSQL();
//        postgreSQL.login();
//        postgreSQL.haritaBilgisiniGetir();
//
//        MySql mySql = new MySql();
//        mySql.login();

        DatabaseManager databaseManager;

        int karar;

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------\n< Interface Kullanımı >\n-----------------");

        System.out.print("[1] - MysqlDatabase Bağlan\n[2] - PostgreSQLDatabase Bağlan\n-----------------\n-> Kararınız:");

        karar = scanner.nextInt();
        switch (karar) {
            case 1:
                databaseManager = new DatabaseManager(new MySql());
                System.out.printf("--------------------------------------");
                databaseManager.loginDataBase();
                System.out.printf("--------------------------------------");
                databaseManager.selectMenu();
                break;
            case 2:
                databaseManager = new DatabaseManager(new PostgreSQL());
                System.out.printf("--------------------------------------");
                databaseManager.loginDataBase();
                System.out.printf("--------------------------------------");
                databaseManager.selectMenu();
                break;
            default:
                System.out.println("Geçerli bir seçenek giriniz!!!");
                break;
        }

    }
}
