package com.Praj.Spring.jdbctemp.controller;

import com.Praj.Spring.jdbctemp.dao.CustomerDao;
import com.Praj.Spring.jdbctemp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cust")
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody Customer customer){
        String msg = customerDao.save(customer);
        return msg;
    }

    @GetMapping("/findAll")
    public List<Customer> getAllCustomer(){
        return customerDao.findAll();
    }

    @GetMapping("/findById/{userId}")

    public Customer findById(@PathVariable Long userId){
        return customerDao.findById(userId);
    }
    @PutMapping("/updateCustomer/{userId}")
    public String update(@RequestBody Customer customer,@PathVariable Long userId){

        customerDao.update(userId,customer);
        return "Record updated successfully";
    }
    @DeleteMapping("/delete/{userId}")

    public String delete(@PathVariable Long userId){
        customerDao.deleteById(userId);
        return "Record deleted successfully";
    }
}
