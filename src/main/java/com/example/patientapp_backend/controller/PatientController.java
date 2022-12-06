package com.example.patientapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PatientController {
    @PostMapping("/")
    public String AddPatient()
    {
        return "Welcome to patient add page";
    }

    @GetMapping("/view")
    public String ViewPatient()
    {
        return "Welcome to patient view page";
    }

}
