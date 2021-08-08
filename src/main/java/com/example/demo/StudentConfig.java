package com.example.demo;

import java.time.LocalDate;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args-> {
            Student chris = new Student(
            null,
            "Christos",
            "artachanidisc@hotmail.com",
            LocalDate.of(1992, 9, 24) );

            Student john = new Student(
            null,
            "John",
            "artachanidisj@hotmail.com",
            LocalDate.of(1990, 8, 14));

            repository.saveAll(
                List.of(chris,john)
            ) ;

        };
    }

}
