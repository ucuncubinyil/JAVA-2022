package com.company.dao;


import com.company.entity.Product;
import com.company.helpers.JDBCHelper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {

    public static final String INSERT_SQL_QUERY = "INSERT INTO products(PRODUCT_ID, NAME, DESCRIPTION, GALLERY_ID, WAYBILL_URL, CREATED_AT) VALUES(?,?,?,?,?,?)";


    public static void insertProduct(Product p) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = JDBCHelper.getConnection();
            if (connection == null) {
                System.out.println("Database Connection ERROR !");
            }else{
                connection.setAutoCommit(false);
                ps = connection.prepareStatement(INSERT_SQL_QUERY);
                ps.setLong(1, p.getProductId());
                ps.setString(2, p.getName());
                ps.setString(3, p.getDescription());
                ps.setLong(4, p.getGalleryId());
                ps.setString(5, p.getWayBilUrl());
                ps.setDate(6, new Date(p.getCreatedAt().getTime()));

                ps.execute();
                System.out.println("Product is added  ->> " + p.toString());
                connection.commit();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
