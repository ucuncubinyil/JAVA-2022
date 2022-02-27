package com.company.repository;

import com.company.entity.Customer;
import com.company.utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerRepository implements CrudDao<Customer> {

    private Connection connection = null;


    public CustomerRepository() {
        this.connection = new ConnectionFactory().getConnection();
    }

    @Override
    public Customer save(Customer entity) {

        String sqlScript = "INSERT INTO customers(id,first_name, last_name, cell_number, birth_date, is_single, address ) " +
                "VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pt = connection.prepareStatement(sqlScript);
            pt.setLong(1, entity.getId());
            pt.setString(2, entity.getFirstName());
            pt.setString(3,entity.getLastName());
            pt.setString(4, entity.getCellNumber());
            pt.setDate(5, (Date) entity.getBirthDate());
            pt.setBoolean(6, entity.getSingle());
            pt.setString(7, entity.getAddress());

            pt.execute();
            pt.close();

        } catch (SQLException exception) {
            exception.getMessage();
        }

        return entity;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public Customer update(Customer entity) {
        return null;
    }
}
