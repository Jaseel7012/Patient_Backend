package com.example.Patient1Backendapp.Dao;

import com.example.Patient1Backendapp.Model.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientDao extends CrudRepository<Patient,Integer> {

    @Query(value = "SELECT `id`, `address`, `contact_no`, `doc_name`, `patient_id`, `patient_name`, `addres` FROM `patient` WHERE `patient_id` =:patient_id ",nativeQuery = true)
    List<Patient> Patientsearch(@Param("patient_id") Integer patient_id);
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient` WHERE `id` =:id ",nativeQuery = true)
    void Deletepatient(@Param("id") Integer id);

}
