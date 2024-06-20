package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Dinithi = new Student("Dinithi", "Dinithi@gmail.com", LocalDate.of(2002, Month.OCTOBER, 13));
            Student Piyumi = new Student("Piyumi", "Piyumi@gmail.com", LocalDate.of(1998, Month.JUNE, 13));

            repository.saveAll(
                    List.of(Dinithi, Piyumi)
            );

        };
    }
}
