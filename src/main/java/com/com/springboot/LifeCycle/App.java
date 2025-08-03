package com.com.springboot.LifeCycle;

import com.com.springboot.Alien;
import com.com.springboot.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(com.com.springboot.MovingToSpringBootFromSpringApplication.class, args);
        LifeCycleUsingInterface lifeCycle = applicationContext.getBean(LifeCycleUsingInterface.class);
        System.out.println(lifeCycle);

        LifeCycleUsingAnnotations lifeCycleAnnotation = applicationContext.getBean(LifeCycleUsingAnnotations.class);
        System.out.println(lifeCycleAnnotation);
    }
}
