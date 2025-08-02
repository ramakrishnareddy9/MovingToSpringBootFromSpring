package com.com.springboot.LifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class LifeCycleUsingAnnotations {

    private String name;
    private int price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "LifeCycleUsingAnnotations{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    @PostConstruct
    public void init() {
        System.out.println("init method is called");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy method is called");
    }
}
