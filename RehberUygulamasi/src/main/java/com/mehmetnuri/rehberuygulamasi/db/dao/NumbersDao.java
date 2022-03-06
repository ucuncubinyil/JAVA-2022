package com.mehmetnuri.rehberuygulamasi.db.dao;

import com.mehmetnuri.rehberuygulamasi.db.ConnectionFactory;
import com.mehmetnuri.rehberuygulamasi.db.entity.Numbers;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NumbersDao {

    private Connection connection;

    public NumbersDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public Numbers addNumber(Numbers number) {
        String sql = "INSERT INTO numbers(name, surname,number) " +
                " VALUES(?,?,?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, number.getName());
            ps.setString(2, number.getSurname());
            ps.setLong(3, number.getNumber());

            ps.execute();
            ps.close();

        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return number;
    }

    public Boolean deleteNumber(Long id) {
        Boolean status = null;
        String sql = "DELETE FROM numbers WHERE id = ?";
        try {
            PreparedStatement pt = connection.prepareStatement(sql);
            pt.setLong(1, id);

            pt.execute();
            pt.close();
            status = true;
        } catch (SQLException e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }

    public List<Numbers> findAllNumbers() {

        String sql = "SELECT * FROM numbers";

        List<Numbers> numbersList = new ArrayList<>();

        PreparedStatement pt = null;
        try {
            pt = connection.prepareStatement(sql);
            ResultSet rs = pt.executeQuery();
            while (rs.next()) {
                Numbers numbers = new Numbers();
                numbers.setId(rs.getLong("id"));
                numbers.setName(rs.getString("name"));
                numbers.setSurname(rs.getString("surname"));
                numbers.setNumber(rs.getLong("number"));
                numbersList.add(numbers);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numbersList;
    }


    public Boolean updateNumber(Numbers numbers) {

        Boolean status;
        String sql = "UPDATE numbers SET name= ?, surname=?, number=? WHERE id=?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, numbers.getName());
            ps.setString(2, numbers.getSurname());
            ps.setLong(3, numbers.getNumber());
            ps.setLong(4, numbers.getId());

            ps.execute();
            ps.close();
            status = true;

        } catch (SQLException e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }
}
