package com.com.springboot.setterInjuction;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Employee {
    private String name;
    private List<String> skills;
    private Set<String> languages;
    private Map<String, String> courses;

    public Employee(String name, List<String> skills, Set<String> languages, Map<String, String> courses) {
        this.name = name;
        this.skills = skills;
        this.languages = languages;
        this.courses = courses;
    }
    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                ", languages=" + languages +
                ", courses=" + courses +
                '}';
    }
}
