package com.mehmetnuri.rehberuygulamasi.servlet;

import com.google.gson.Gson;
import com.mehmetnuri.rehberuygulamasi.db.dao.NumbersDao;
import com.mehmetnuri.rehberuygulamasi.db.entity.Numbers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FindAllRecordServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        NumbersDao dao = new NumbersDao();

        List<Numbers> numbersList = dao.findAllNumbers();

        Gson gson = new Gson();
        String listAsJson = gson.toJson(numbersList);

        writer.write(listAsJson);

    }
}
