package com.scheduler.myscheduler.employee;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName ="employee_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator =  "employee_sequence"
    )
    private int id;
    private String name;
    private String phone;
    private int[] workDays;

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

    public Employee(int id, String name, String phone, int[] workDays) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.workDays = workDays;
    }

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
