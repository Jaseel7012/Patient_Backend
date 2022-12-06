package com.example.Patient1Backendapp.Controller;

import com.example.Patient1Backendapp.Model.Patient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
    @GetMapping("/")

    public  String Home(){
        return "home page";
    }
    @PostMapping(path = "/add",consumes ="application/json",produces = "application/json")
    public String Add(@RequestBody Patient p){
        System.out.println(p.getPatient_name().toString());
        return "Employee add page";
    }
    @GetMapping("/view")
    public  String View(){
        return "view page";
    }
}
