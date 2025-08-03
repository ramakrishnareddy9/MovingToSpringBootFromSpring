package com.com.springboot.constructorInjuction;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    private int id;
    private String name;
    private String mailId;
    private List<String> courses;

    public Student(int id, String name, String mailId, List<String> courses) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.courses = courses;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mailId='" + mailId + '\'' +
                ", courses=" + courses +
                '}';
    }
}