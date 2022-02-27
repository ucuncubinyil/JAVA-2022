package com.company.repository;

import com.company.entity.School;
import com.company.utils.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScoolRepository implements CrudDao<School> {

    private Connection connection;

    public ScoolRepository() {
        this.connection = new ConnectionFactory().getConnection();
    }

    @Override
    public School save(School entity) {

        String sqlScript = " INSERT INTO scools (id,name, capacity, country) VALUES(?,?,,??) ";
        try {

            PreparedStatement pt = connection.prepareStatement(sqlScript);
            pt.setLong(1, entity.getId());
            pt.setString(2, entity.getName());
            pt.setLong(3, entity.getCapacity());
            pt.setString(4, entity.getCountry());

            pt.execute();
            pt.close();

        } catch (SQLException e) {
            e.getMessage();

        }

        return entity;
    }

    @Override
    public School findById(Long id) {

        School school = new School();

        String sqlScript = "Select * from scools  where id=?";

        try {
            PreparedStatement st = connection.prepareStatement(sqlScript);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                school.setId(rs.getLong("id"));
                school.setName(rs.getString("name"));
                school.setCapacity(rs.getLong("capacity"));
                school.setCountry(rs.getString("country"));

            }
            rs.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return school;
    }

    @Override
    public List<School> findAll() {

        List<School> schoolList = new ArrayList<>();

        String sqlScript = "SELECT * FROM scools";
        try {
            PreparedStatement st = connection.prepareStatement(sqlScript);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                School school = new School();
                school.setId(rs.getLong("id"));
                school.setName(rs.getString("name"));
                school.setCapacity(rs.getLong("capacity"));
                school.setCountry(rs.getString("country"));
                schoolList.add(school);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return schoolList;
    }

    @Override
    public boolean deleteById(Long id) {

        boolean isDeleted = false;
        String sqlScript = "DELETE FROM scools where id=?";

        try {
            PreparedStatement pt = connection.prepareStatement(sqlScript);
            pt.setLong(1, id);
            pt.execute();
            pt.close();
            isDeleted = true;

        } catch (SQLException e) {
            e.printStackTrace();
            isDeleted = false;
        }

        return isDeleted;
    }

    @Override
    public School update(School entity) {

        String sqlScript = "UPDATE scools SET name=?, capacity=?, country=? where id=? ";

        try {
            PreparedStatement pt = connection.prepareStatement(sqlScript);
            pt.setString('1',entity.getName());
            pt.setLong(2, entity.getCapacity());
            pt.setString(3, entity.getCountry());
            pt.setLong(4, entity.getId());

            pt.execute();
            pt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return entity;
    }
}
