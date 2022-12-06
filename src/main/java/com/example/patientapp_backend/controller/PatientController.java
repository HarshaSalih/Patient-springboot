package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.PatientDao;
import com.example.patientapp_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PatientController {

    @Autowired
    private PatientDao dao;

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddPatient(@RequestBody Patient p)
    {
        System.out.println(p.getName().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getMobile().toString());
        System.out.println(p.getDateOfAppointment().toString());
        System.out.println(p.getDoctorName().toString());
        dao.save(p);
        return "Patient added successfully";
    }

    @CrossOrigin (origins = "*")
    @GetMapping("/view")
    public List<Patient> View()
    {
        return (List<Patient>)dao.findAll();
    }

}
