package com.company;

import com.company.entity.School;
import com.company.repository.ScoolRepository;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ScoolRepository repository = new ScoolRepository();

        School school = new School();

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Lütfen okulun ID bilgisini giriniz: ");
//        school.setId(Long.valueOf(scanner.nextLine()));
//
//        System.out.println("Lütfen Okulun Adını Giriniz: ");
//        school.setName(scanner.nextLine());
//
//
//        System.out.println("Lütfen okulun kapasite bilgisini giriniz: ");
//        school.setCapacity(Long.valueOf(scanner.nextLine()));
//
//        System.out.println("Lütfen okulun ülke bilgisini giriniz: ");
//        school.setCountry(scanner.nextLine());
//
//
//        System.out.println(repository.save(school));;

//        System.out.println( repository.findById(1L));

//        List<School> schoolList = repository.findAll();
//
//        for (School school1 : schoolList) {
//            System.out.println(school1);
//        }

        School school1 = new School();
        school1.setId(1L);
        school1.setName("İstanbul Teknik Üniversitesi (İTÜ)");
        school1.setCapacity(3000L);
        school1.setCountry("BR");

        System.out.println(repository.update(school1));;

    }
}
