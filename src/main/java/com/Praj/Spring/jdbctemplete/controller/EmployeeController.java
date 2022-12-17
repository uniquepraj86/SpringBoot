package com.Praj.Spring.jdbctemplete.controller;
import com.Praj.Spring.jdbctemplete.dao.EmployeeDao;
import com.Praj.Spring.jdbctemplete.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee)
    {
        return employeeDao.save(employee);
    }

    @GetMapping("/findAll")
    public List<Employee> getAllEmployee(){
        return employeeDao.findAll();
    }

    @GetMapping("/findById/{userId}")
    public Employee findById(@PathVariable Long userId)
    {
        return employeeDao.findById(userId);
    }

    @PutMapping("/updateEmployee/{userId}")
    public String update(@RequestBody Employee employee,@PathVariable Long userId)
    {
        employeeDao.update(userId,employee);
        return "Record updated successfully";
    }
    @DeleteMapping("/delete/{userId}")
    public String delete(@PathVariable Long userId)
    {
        employeeDao.deleteById(userId);
        return "Record deleted successfully";
    }
}
