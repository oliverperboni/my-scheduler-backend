package com.scheduler.myscheduler.employee;

import java.util.Arrays;
import java.util.List;

import com.scheduler.myscheduler.appointment.Appointment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String phone;
    private int[] workDays;
    @OneToMany(mappedBy = "employee")
    private List<Appointment> appointments;

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", workDays=" + Arrays.toString(workDays)
                + "]";
    }

    public Employee(String name, String phone, int[] workDays) {
        this.name = name;
        this.phone = phone;
        this.workDays = workDays;
    }

    // public Employee(int id, String name, String phone, int[] workDays) {
    //     this.id = id;
    //     this.name = name;
    //     this.phone = phone;
    //     this.workDays = workDays;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int[] workDays) {
        this.workDays = workDays;
    }


}
