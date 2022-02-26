package com.company;

import com.company.dao.UserDao;
import com.company.entity.UserEntity;

public class Main {

    public static void main(String[] args) {
        UserEntity kullanici1 = new UserEntity();
        kullanici1.setId(1L);
        kullanici1.setUsername("Onur X");
        kullanici1.setPassword("454454545");
//
//        UserEntity kullanici2 = new UserEntity(2L, "Mehmet", "1256");
//
//        UserDao userDao = new UserDao();
//        userDao.insertUser(kullanici2);

        UserDao userDao = new UserDao();
//        userDao.deleteUser(2L);
//       List<UserEntity> entityList =   userDao.getAllUsers();
//
//        System.out.println(entityList.size());

        userDao.updateUser(kullanici1);
        System.out.println(userDao.getTotalUserCount());


    }
}
