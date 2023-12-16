package com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.controller;

import com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.models.Doctor;
import com.covidvaccination.distributionsystem.Covid.Vaccination.Distribution.Backend.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorCOntroller {
    @Autowired
    DoctorService doctorService;
    @PostMapping("/register")
    public String registerDoctor(@RequestBody Doctor obj){
        Doctor doctor = doctorService.registerDoctor(obj);
        return  "Doctor got registered";
    }
}
