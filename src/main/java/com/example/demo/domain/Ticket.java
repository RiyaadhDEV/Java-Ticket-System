package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Ticket {
    @Id
    private String ticketNumber;
    private String title;
    private String department;
    private String assignee;
    private LocalDate date;
    private LocalTime time;
    private String preferredResolveDate;
    private String status;
    private String description;

    public Ticket() {
    }

    public Ticket(String ticketNumber, String title, String department, String assignee, LocalDate date, LocalTime time, String preferredResolveDate, String status, String description) {
        this.ticketNumber = ticketNumber;
        this.title = title;
        this.department = department;
        this.assignee = assignee;
        this.date = date;
        this.time = time;
        this.preferredResolveDate = preferredResolveDate;
        this.status = status;
        this.description = description;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void setPreferredResolveDate(String preferredResolveDate) {
        this.preferredResolveDate = preferredResolveDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    public String getAssignee() {
        return assignee;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getPreferredResolveDate() {
        return preferredResolveDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", title='" + title + '\'' +
                ", department='" + department + '\'' +
                ", assignee='" + assignee + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", preferredResolveDate='" + preferredResolveDate + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
