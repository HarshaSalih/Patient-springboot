package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.PatientDao;
import com.example.patientapp_backend.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class PatientController {

    @Autowired
    private PatientDao dao;

    @CrossOrigin (origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> AddPatient(@RequestBody Patient p)
    {
        System.out.println(p.getName().toString());
        System.out.println(p.getAddress().toString());
        System.out.println(p.getMobile().toString());
        System.out.println(p.getDateOfAppointment().toString());
        System.out.println(p.getDoctorName().toString());
        dao.save(p);
        HashMap<String,String>map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin (origins = "*")
    @GetMapping("/view")
    public List<Patient> View()
    {
        return (List<Patient>)dao.findAll();
    }

}
