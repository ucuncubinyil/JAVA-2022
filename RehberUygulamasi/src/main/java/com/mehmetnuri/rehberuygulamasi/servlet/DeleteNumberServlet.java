package com.mehmetnuri.rehberuygulamasi.servlet;

import com.mehmetnuri.rehberuygulamasi.db.dao.NumbersDao;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteNumberServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        NumbersDao dao = new NumbersDao();

        String id = request.getParameter("id");

        if (id == null) {
            try {
                response.sendError(404);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            Boolean status = dao.deleteNumber(Long.valueOf(id));
            if (status) {
                response.setStatus(203);
            }
        }

    }

}
