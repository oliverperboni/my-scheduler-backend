package com.scheduler.myscheduler.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scheduler.myscheduler.servicos.ServiceRepository;
import com.scheduler.myscheduler.servicos.Servicos;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunnerUser(UserRepository repository){
    
        return args -> { User alice = new User("Alice", "alice@gmail.com", "945852741");
                        User bob = new User("Bod", "bob@gmail.com", "951753258");

                        repository.saveAll(
                            List.of(alice, bob)
                        );
        };

    }

}
