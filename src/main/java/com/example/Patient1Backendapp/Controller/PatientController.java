package com.example.Patient1Backendapp.Controller;

import com.example.Patient1Backendapp.Dao.PatientDao;
import com.example.Patient1Backendapp.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @GetMapping("/")

    public  String Home(){
        return "home page";
    }
    @PostMapping(path = "/add",consumes ="application/json",produces = "application/json")
    public String Add(@RequestBody Patient p){
        System.out.println(p.getPatient_name().toString());
        dao.save(p);
        return "Employee add page";
    }
    @GetMapping("/view")
    public List<Patient> View(){
        return (List<Patient> ) dao.findAll();
    }
}
