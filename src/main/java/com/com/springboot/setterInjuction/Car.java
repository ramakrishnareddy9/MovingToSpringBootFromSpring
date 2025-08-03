package com.com.springboot.setterInjuction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine eng;

    public Car() {
        System.out.println("Car is running");
    }
    public Car(Engine eng) {
        this.eng = eng;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
    @Override
    public String toString() {
        return "Car{" +
                "eng=" + eng +
                '}';
    }
}
