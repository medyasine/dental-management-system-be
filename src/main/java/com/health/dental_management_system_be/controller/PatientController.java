package com.health.dental_management_system_be.controller;


import com.health.dental_management_system_be.entity.Patient;
import com.health.dental_management_system_be.service.PatientService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN') or hasRole('DENTIST')")
    public List<Patient> getAll() {
        return service.findAll();
    }
}