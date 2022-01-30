package com.company.manager;

import com.company.interfaces.Database;

import java.util.Scanner;

public class DatabaseManager {

    private Database database;

    public DatabaseManager(Database database) {
        this.database = database;
    }

    public void loginDataBase() {
        database.login();
    }

    public void addDatabase() {
        database.add();
    }

    public void deleteFromDatabase() {
        database.delete();
    }

    public void getFromDatabase() {
        database.get();
    }

    public void updateDatabase() {
        database.update();
    }

    public void selectMenu() {
        int kararVer;
        Scanner scanner = new Scanner(System.in);


        System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Veri Ekle\n[2] - Veri Sil\n[3] - Veri Getir\n[4] - Veri Güncelle\n-----------------\n-> Kararınız:");

        kararVer = scanner.nextInt();

        switch (kararVer) {
            case 1:
                System.out.printf("--------------------------------------");
                addDatabase();
                break;
            case 2:
                System.out.printf("--------------------------------------");
                deleteFromDatabase();
                break;
            case 3:
                System.out.printf("--------------------------------------");
                getFromDatabase();
                break;
            case 4:
                System.out.printf("--------------------------------------");
                updateDatabase();
                break;
            default:
                System.out.printf("--------------------------------------");
                System.out.println("Lütfen geçerli bir seçenek girin !!!");
                break;
        }

    }
}
