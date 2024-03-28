package com.scheduler.myscheduler.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/employee")
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
    @GetMapping(path = "{id}")
	public Employee getEmployee(@PathVariable("id") int id){
		return employeeService.getEmployee(id);
	}

    @PostMapping
    public void registerNewEmployee(@RequestBody Employee employee){
        employeeService.addNewStudent(employee);
    }

    @DeleteMapping(path = "{id}")
    public void deleteEmployee( @PathVariable("id") int id){
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping(path = "{id}")
    public void updateEmployee(@PathVariable("id") int id,@RequestParam String name ){
        employeeService.updateEmployeeById(id,name);
    }

}
