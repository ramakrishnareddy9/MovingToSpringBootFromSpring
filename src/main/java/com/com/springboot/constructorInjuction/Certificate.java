package com.com.springboot.constructorInjuction;

import org.springframework.stereotype.Component;

@Component
public class Certificate {
    private int id;
    private String grade;
    private Person person;

    public Certificate(int id, String grade, Person person) {
        this.id = id;
        this.grade = grade;
        this.person = person;
    }

    public Certificate() {
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "id=" + id +
                ", grade='" + grade + '\'' +
                ", person=" + person +
                '}';
    }
}


