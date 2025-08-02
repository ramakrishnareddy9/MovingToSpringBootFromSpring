package com.com.springboot;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
    public void study(){
        System.out.println("Student is studying");
    }
}