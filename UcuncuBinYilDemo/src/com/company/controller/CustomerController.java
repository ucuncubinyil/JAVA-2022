package com.company.controller;

import com.company.entity.Customer;
import com.company.repository.CustomerRepository;

import java.util.List;

public class CustomerController {

    private CustomerRepository customerRepository;

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.update(customer);
    }

    public boolean deleteCustomer(Long id) {
        return customerRepository.deleteById(id);
    }

}
