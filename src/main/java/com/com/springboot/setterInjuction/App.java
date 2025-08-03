package com.com.springboot.setterInjuction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        Car car = context.getBean(Car.class);
        car.getEng().setFuel("Petrol");
        System.out.println(car);

        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        Student student = context.getBean(Student.class);
//        student.setId(102);
//        student.setName("ramu");
//        student.setMailId("ramu@gmail.com"); // if not declared at AppConfig
        System.out.println(student);

        context.close();
    }
}
