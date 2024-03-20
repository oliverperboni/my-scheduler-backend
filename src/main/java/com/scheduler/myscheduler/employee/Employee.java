package com.scheduler.myscheduler.employee;

import java.util.Arrays;

public class Employee {
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
