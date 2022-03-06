package com.mehmetnuri.rehberuygulamasi.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.mehmetnuri.rehberuygulamasi.db.dao.NumbersDao;
import com.mehmetnuri.rehberuygulamasi.db.entity.Numbers;

public class InsertNumberServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {

        NumbersDao numbersDao = new NumbersDao();

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;
        try {
            BufferedReader bufferedReader = request.getReader();

            while ((line = bufferedReader.readLine()) != null) stringBuffer.append(line);

            String rehberAsJson = stringBuffer.toString();

            Gson gson = new Gson();

            Numbers number = gson.fromJson(rehberAsJson, Numbers.class);

            numbersDao.addNumber(number);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
