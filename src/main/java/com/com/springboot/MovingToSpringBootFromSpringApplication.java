package com.com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovingToSpringBootFromSpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MovingToSpringBootFromSpringApplication.class, args);
        Student student = applicationContext.getBean("student", Student.class);
        student.study();

        Alien alien = applicationContext.getBean(Alien.class);
        alien.setAge(20);
        System.out.println(alien.getAge());
        alien.code();
    }
}
