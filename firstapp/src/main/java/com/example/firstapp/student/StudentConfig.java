package com.example.firstapp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student balaji  = new Student("Balaji",  28, "Java, JavaScript", LocalDate.of(1996, Month.OCTOBER, 19));
            Student john  = new Student("John Deo",  28, "Java, JavaScript", LocalDate.of(1996, Month.OCTOBER, 19));

            studentRepository.saveAll(List.of(balaji, john));

        };

    }
}
