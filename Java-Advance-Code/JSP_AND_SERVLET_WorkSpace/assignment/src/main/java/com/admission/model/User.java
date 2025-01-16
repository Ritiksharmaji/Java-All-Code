package com.admission.model;

public class User {
    private int id;
    private String name;
    private String dob;
    private String email;
    private String mobile;
    private String address;
    private String course;
    private String photo;
    private String signature;
    private String password;

    // Constructor for registration
    public User(String name, String dob, String email, String mobile, String address, 
                String course, String photo, String signature, String password) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.course = course;
        this.photo = photo;
        this.signature = signature;
        this.password = password;
    }

    // Constructor for login (without photo and signature)
    public User(int id, String name, String dob, String email, String mobile, 
                String address, String course, String photo, String signature, String password) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.course = course;
        this.photo = photo;
        this.signature = signature;
        this.password = password;
    }

    // Getters and Setters
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
