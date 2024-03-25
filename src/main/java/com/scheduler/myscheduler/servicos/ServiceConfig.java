package com.scheduler.myscheduler.servicos;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scheduler.myscheduler.employee.Employee;
import com.scheduler.myscheduler.employee.EmployeeRepository;

@Configuration
public class ServiceConfig {

    @Bean
    CommandLineRunner commandLineRunnerService(ServiceRepository repository){
    
        return args -> { Servicos corte = new Servicos("Corte", 60, 10);
                        Servicos corteBarba = new Servicos("Corte e Barba", 90,15);

                        repository.saveAll(
                            List.of(corte, corteBarba)
                        );
        };

    }




}
