package com.scheduler.myscheduler.appointment;

import java.util.List;

import com.scheduler.myscheduler.employee.Employee;
import com.scheduler.myscheduler.servicos.Servicos;
import com.scheduler.myscheduler.user.User;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Appointment {

    @Id
    @SequenceGenerator(
            name = "appointment_sequence",
            sequenceName ="appointment_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator =  "appointment_sequence"
    )
    int id;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_service_id")
    // Servicos servicos;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_employee_id")
    // Employee employee;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "fk_user_id")
    // User user;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Servicos service;

    private int dayWork;

    public Appointment() {
    }

    

    public Appointment(Employee employee, User user, Servicos service, int dayWork) {
        this.employee = employee;
        this.user = user;
        this.service = service;
        this.dayWork = dayWork;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Servicos getService() {
        return service;
    }

    public void setService(Servicos service) {
        this.service = service;
    }

    public int getDayWork() {
        return dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }
 
    



    
}
