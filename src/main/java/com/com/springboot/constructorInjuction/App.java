package com.com.springboot.constructorInjuction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        Certificate certificate = context.getBean(Certificate.class);
        System.out.println(certificate);

        Student student = context.getBean(Student.class);
        System.out.println(student);
    }
}