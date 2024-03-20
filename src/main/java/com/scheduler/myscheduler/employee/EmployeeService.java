package com.scheduler.myscheduler.employee;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {

    @GetMapping
    public List<Employee> getStudent() {
        int[] days = { 1, 2, 3 };
        return List.of(
                new Employee(1, "Nelson", "123456", days)

        );
    }

}
