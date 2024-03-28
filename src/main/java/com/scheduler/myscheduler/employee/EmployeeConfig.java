package com.scheduler.myscheduler.employee;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository){
    
        return args -> { Employee gabriel = new Employee( "Gabriel", "123456", new int[]{1,2,3,4,5},"08:00","22:00");
                        Employee nuno = new Employee( "Nuno", "654321", new int[]{1,2,3,4,5},"08:00","22:00");

                        repository.saveAll(
                            List.of(gabriel, nuno)
                        );
        };

    }

}
