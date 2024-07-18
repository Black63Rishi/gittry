package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @NonNull
    private String role;
    private String gender;
    private int expectedsalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getRole() {
        return role;
    }

    public void setRole(@NonNull String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
public int getExpectedsalary(){
        return expectedsalary;
}

    public void setExpectedsalary(int expectedsalary) {
                    this.expectedsalary = expectedsalary;
    }
}
