package com.example.Patient1Backendapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue
    private int id;
    private int patient_id;
    private String patient_name;
    private String address;
    private String contact_no;
    private String doc_name;

    public Patient() {
    }

    public Patient(int id, int patient_id, String patient_name, String address, String contact_no, String doc_name) {
        this.id = id;
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.address = address;
        this.contact_no = contact_no;
        this.doc_name = doc_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }
}
