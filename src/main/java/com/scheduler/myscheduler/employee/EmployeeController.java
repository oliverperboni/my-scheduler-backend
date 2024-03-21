package com.scheduler.myscheduler.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class EmployeeController {

    private final EmployeeService employeeService;

    
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @GetMapping
	public List<Employee> getStudent(){
		return employeeService.getStudent();
	}

    @PostMapping
    public void registerNewEmployee(@RequestBody Employee employee){
        employeeService.addNewStudent(employee);
    }

}
