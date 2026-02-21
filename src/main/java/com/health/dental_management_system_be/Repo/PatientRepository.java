package com.health.dental_management_system_be.Repo;


import com.health.dental_management_system_be.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {}