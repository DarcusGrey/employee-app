package com.example.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private String id;
    private String name;
    private Integer age;

    // Constructors
    public Employee() {}

    public Employee(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters (essential for Spring to convert Java to JSON)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}