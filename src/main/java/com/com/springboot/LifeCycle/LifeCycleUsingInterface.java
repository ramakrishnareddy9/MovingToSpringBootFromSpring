package com.com.springboot.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleUsingInterface implements InitializingBean, DisposableBean {

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
        return "LifeCycleUsingInterface{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        // init method
        System.out.println("destroy method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method is called");
    }
}