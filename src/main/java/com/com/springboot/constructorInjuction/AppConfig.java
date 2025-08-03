package com.com.springboot.constructorInjuction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Person person() {
        return new Person("Rama krishna reddy", 20);
    }

    @Bean
    public Certificate certificate(Person person) {
        return new Certificate(101, "A+", person);
    }

    @Bean
    public Student student() {
        return new Student(1, "lakshman", "Lakshman@mail.com", Arrays.asList("Java", "Spring", "SQL"));
    }
}