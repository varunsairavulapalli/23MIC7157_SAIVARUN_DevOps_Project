package com.example.college_event_website.model;

public class EventModel {

    private int id;
    private String studentName;
    private String email;
    private String phone;
    private String college;
    private String department;
    private String eventName;

    // Default Constructor
    public EventModel() {
    }

    // Parameterized Constructor
    public EventModel(int id, String studentName, String email,
            String phone, String college,
            String department, String eventName) {

        this.id = id;
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.college = college;
        this.department = department;
        this.eventName = eventName;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for studentName
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter for college
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter and Setter for eventName
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}