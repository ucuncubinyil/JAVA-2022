package com.mehmetnuri.rehberuygulamasi.servlet;

import com.google.gson.Gson;
import com.mehmetnuri.rehberuygulamasi.db.dao.NumbersDao;
import com.mehmetnuri.rehberuygulamasi.db.entity.Numbers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class UpdateNumberServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        NumbersDao dao = new NumbersDao();

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;
        BufferedReader bufferedReader = request.getReader();
        while ((line = bufferedReader.readLine()) != null) stringBuffer.append(line);

        String numbersAsJson = stringBuffer.toString();

        Gson gson = new Gson();
        Numbers number = gson.fromJson(numbersAsJson, Numbers.class);

        Boolean status = dao.updateNumber(number);

        response.setStatus(203);

    }
}
