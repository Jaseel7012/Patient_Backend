package com.example.Patient1Backendapp.Dao;

import com.example.Patient1Backendapp.Model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientDao extends CrudRepository<Patient,Integer> {
}
