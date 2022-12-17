package com.Praj.Spring.jdbctemplete.dao;


import com.Praj.Spring.jdbctemplete.entity.Employee;

import java.util.List;


public interface EmployeeDao {
    String save(Employee e);

    List<Employee> findAll();

   Employee findById(Long id);

  void deleteById(Long id);

    int update(Long id, Employee e);

}

