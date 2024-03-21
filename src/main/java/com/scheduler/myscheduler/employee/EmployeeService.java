package com.scheduler.myscheduler.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class EmployeeService {

    public final EmployeeRepository employeeRepository;
    
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping
    public List<Employee> getStudent() {
        return employeeRepository.findAll();
    }

   
    public void addNewStudent(Employee employee) {
        employeeRepository.save(employee);
    }

}
