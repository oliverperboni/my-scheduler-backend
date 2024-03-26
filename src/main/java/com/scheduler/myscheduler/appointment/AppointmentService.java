package com.scheduler.myscheduler.appointment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scheduler.myscheduler.employee.Employee;
import com.scheduler.myscheduler.employee.EmployeeRepository;
import com.scheduler.myscheduler.servicos.ServiceRepository;
import com.scheduler.myscheduler.servicos.Servicos;
import com.scheduler.myscheduler.user.User;
import com.scheduler.myscheduler.user.UserRepository;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;
    private final ServiceRepository serviceRepository;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository, EmployeeRepository employeeRepository,
            UserRepository userRepository, ServiceRepository serviceRepository) {
        this.appointmentRepository = appointmentRepository;
        this.employeeRepository = employeeRepository;
        this.userRepository = userRepository;
        this.serviceRepository = serviceRepository;
    }

    public List<Appointment> getAppointment() {
        return appointmentRepository.findAll();
    }

    public void addAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    // public void addAppointment(int service, int employee, int user) {
    //     Servicos servicos = serviceRepository.findById(service).orElseThrow();
    //     Employee employee2 = employeeRepository.findById(employee).orElseThrow();
    //     User user2 = userRepository.findById(user).orElseThrow();
    //     Appointment appointment = new Appointment(servicos, employee2, user2);
    //     appointmentRepository.save(appointment);
    // }

}
