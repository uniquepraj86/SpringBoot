package com.Praj.Spring.jdbctemp.dao;

import com.Praj.Spring.jdbctemp.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {



    @Autowired
    private JdbcTemplate jdbcTemplate;


    String insertQuery = "Insert into customer( id, accountno,customername,mobileno,email,address) values(?,?,?,?,?)";
    String findAll = "select * from customer";
    String findById = "select * from customer where id=?";
    String deleteById = "delete from customer where id=?";
    String updateRecords = "update customer set customername=? where id=?";


    @Override
    public String save(Customer e) {
        Object fields [] = new Object[]{e.getAccountno(),e.getCustomername(),e.getMobileno(),e.getEmail(),e.getAddress()};
        jdbcTemplate.update(insertQuery,fields);
        return "Data saved successfully";
    }

    @Override
    public List<Customer> findAll() {
        return jdbcTemplate.query("select * from employee",new BeanPropertyRowMapper<Customer>(Customer.class));
    }

    @Override
    public Customer findById(Long id) {
        return jdbcTemplate.queryForObject(findById,new BeanPropertyRowMapper<>(Customer.class),id);
    }

    @Override
    public void deleteById(Long id) {
        jdbcTemplate.update(deleteById,id);
    }

    @Override
    public int update(Long id, Customer e) {

        return jdbcTemplate.update(updateRecords,new Object[]{e.getAccountno(),e.getCustomername(),e.getMobileno(),e.getEmail(),e.getAddress()},id);
    }
}
