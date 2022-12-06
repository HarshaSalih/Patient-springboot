package com.example.patientapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name="Patient")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int id;
    private String name;
    private String address;
    private String mobile;
    private String dateOfAppointment;
    private String doctorName;

    public Patient() {
    }

    public Patient(int id, String name, String address, String mobile, String dateOfAppointment, String doctorName) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.dateOfAppointment = dateOfAppointment;
        this.doctorName = doctorName;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(String dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
