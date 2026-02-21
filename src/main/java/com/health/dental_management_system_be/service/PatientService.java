package com.health.dental_management_system_be.service;


import com.health.dental_management_system_be.Repo.PatientRepository;
import com.health.dental_management_system_be.entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
  private final PatientRepository repo;

  public PatientService(PatientRepository repo) {
    this.repo = repo;
  }

  public List<Patient> findAll() {
    return repo.findAll();
  }
}