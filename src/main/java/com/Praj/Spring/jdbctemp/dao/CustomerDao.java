package com.Praj.Spring.jdbctemp.dao;

import com.Praj.Spring.jdbctemp.entity.Customer;

import java.util.List;

public interface CustomerDao {

        String save(Customer e);

        List<Customer> findAll();
        Customer findById(Long id);
        void deleteById(Long id);

        int update(Long id, Customer e);


}


