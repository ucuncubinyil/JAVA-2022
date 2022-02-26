package com.company.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //Veritabanı bağlantısı için gerekli olan jdbc url adresi
    private final static String url = "jdbc:postgresql://kandula.db.elephantsql.com:5432/nnpdtyax";

    //Veritabanı kullanıcı adı
    private final static String username = "nnpdtyax";

    //Veritabanı kullanıcı şifresi
    private final static String password = "GHFZB2IN3K3U4Dhfb1Jonxv5deDAvazQ";

    /**
     * Sadece 1 bağlantı nesnesi oluşturmamız için Factory tasarım prensibine uygun bağlantı metodu
     * @return
     */
    public Connection getConnection() {

        //Boş connection nesnesi
        Connection connection = null;

        /**
         * Kullanmış olduğumuz Postgresql driver i var mı yok mu kontrolünü sağlar
         */
        try {
            Class.forName("org.postgresql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }

        // Veritabanına girilen bilgilere göre bağlantıyı sağlar
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Bağlantı Başarılı !!!");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return connection;
    }
}
