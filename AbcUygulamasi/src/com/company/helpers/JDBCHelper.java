package com.company.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCHelper {

    private static Connection connection;
    static {
        try {
            Class.forName(JDBCConstants.DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }

    public static Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(JDBCConstants.URL, JDBCConstants.USER_NAME,JDBCConstants.PASSWORD);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
