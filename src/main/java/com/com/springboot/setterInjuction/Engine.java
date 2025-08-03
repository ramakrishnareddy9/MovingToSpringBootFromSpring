package com.com.springboot.setterInjuction;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String fuel;

    public Engine() {
        System.out.println("Engine is started");
    }

    public Engine(String fuel) {
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}

