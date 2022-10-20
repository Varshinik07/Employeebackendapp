package com.example.employeebackend1.controller;

import com.example.employeebackend1.dao.EmployeeDao;
import com.example.employeebackend1.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/addemployee",consumes = "application/json",produces = "application/json")
    public String addemployee(){
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewemployee")
    public List<EmployeeModel> viewemployee(){
        return (List<EmployeeModel>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @Transactional
    @PostMapping(path="/deleteemployee",consumes = "application/json",produces = "application/json")
    public String deleteemployee(@RequestBody EmployeeModel employee){
        dao.deleteemployeeById(employee.getId());
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(value = "/searchemployee",consumes="application/json",produces = "application/json")
    public List<EmployeeModel> searchemployee(@RequestBody EmployeeModel employee){
        return (List<EmployeeModel>) dao.searchemployee(employee.getEmployeename());
    }

}
