package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.util.Arrays;

@Entity
public class User {
    @Id
    private String id;
    private String department;
    private String name;
    private String surname;
    private String email;
    private String jobDescription;
    @Lob
    private byte[] image;
    private String assignedTickets;

    public User() {
    }

    public User(String id, String department, String name, String surname, String email, String jobDescription, byte[] image, String assignedTickets) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.jobDescription = jobDescription;
        this.image = image;
        this.assignedTickets = assignedTickets;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setAssignedTickets(String assignedTickets) {
        this.assignedTickets = assignedTickets;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getImage() {
        return image;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getAssignedTickets() {
        return assignedTickets;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", image=" + Arrays.toString(image) +
                ", assignedTickets='" + assignedTickets + '\'' +
                '}';
    }
}
