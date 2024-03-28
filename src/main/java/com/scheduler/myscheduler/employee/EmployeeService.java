package com.scheduler.myscheduler.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.transaction.Transactional;

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

    @Transactional
    public void updateEmployeeById(int id, String name) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new IllegalStateException());
        employee.setName(name);
    }

    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee getEmployee(int id) {
        return employeeRepository.findEmpleyeeById(id);
    }

}
