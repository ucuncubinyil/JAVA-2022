package com.company.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private final static String url = "jdbc:postgresql://kandula.db.elephantsql.com:5432/nnpdtyax";
    private final static String username = "nnpdtyax";
    private final static String password = "GHFZB2IN3K3U4Dhfb1Jonxv5deDAvazQ";

    public Connection getConnection() {
        checkDriver();
        return connectDB();
    }

    private Connection connectDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private void checkDriver() {
        try {
            Class.forName("org.postgresql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
