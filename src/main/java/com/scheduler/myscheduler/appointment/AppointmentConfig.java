package com.scheduler.myscheduler.appointment;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scheduler.myscheduler.employee.Employee;
import com.scheduler.myscheduler.servicos.Servicos;
import com.scheduler.myscheduler.user.User;

@Configuration
public class AppointmentConfig {

    // @Bean
    // CommandLineRunner commandLineRunnerAppointment(AppointmentRepository repository){
    
    //     return args -> { Servicos corte = new Servicos("Corte da marcaao", 60, 10);
    //                     Employee nuno = new Employee( "Andre", "654321", new int[]{1,2,3,4,5});
    //                     User bob = new User("Bob", "bob@gmail.com", "951753258");
    //                     Appointment appointment = new Appointment(corte, nuno, bob);

    //                     repository.saveAll(
    //                         List.of(appointment)
    //                     );
    //     };

    // }


}
