package com.example.Patient1Backendapp.Controller;

import com.example.Patient1Backendapp.Dao.PatientDao;
import com.example.Patient1Backendapp.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")

    public  String Home(){
        return "home page";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addpatient",consumes ="application/json",produces = "application/json")
    public String Add(@RequestBody Patient p){
        System.out.println(p.getPatient_name());
        dao.save(p);
        return "Patient add successfully";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewpatient")
    public List<Patient> View(){
        return (List<Patient> ) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Patient> Search(@RequestBody Patient p){
        System.out.println(p.getPatient_id());
        return (List<Patient>) dao.Patientsearch(p.getPatient_id());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> Delete(@RequestBody Patient p){
        String patientid=String.valueOf(p.getId());
        System.out.println(patientid);
        dao.Deletepatient(p.getId());
        HashMap<String,String> map =new HashMap<>();
        map.put("status","success");
        return  map;


    }
}
