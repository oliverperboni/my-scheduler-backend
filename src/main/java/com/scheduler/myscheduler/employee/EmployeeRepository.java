package com.scheduler.myscheduler.employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    
    // @Query("SELECT s FROM Employee WHERE s.name = ?1 ")
    Optional<Employee> findEmpleyeeByName(String name);


    Employee findEmpleyeeById(int id);    
}
