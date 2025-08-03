package com.com.springboot.setterInjuction;

import com.com.springboot.setterInjuction.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
public class AppConfig {

    @Bean
    public Employee employee() {
        Employee emp = new Employee();
        emp.setName("Ram");
        emp.setSkills(List.of("Java", "Spring Boot", "SQL"));
        emp.setLanguages(Set.of("English", "Telugu"));
        emp.setCourses(Map.of(
                "C1", "Core Java",
                "C2", "Spring Boot",
                "C3", "Microservices"
        ));
        return emp;
    }

    @Bean
    public Student student() {
        Student s = new Student();
        s.setId(101);
        s.setName("vishnu");
        s.setMailId("vishnu@gmail.com");
        return s;
    }
}

