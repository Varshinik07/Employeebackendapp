package com.example.employeebackend1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private String employeename;
    private String employeecode;
    private String address;
    private int salary;
    private String companyname;
    private String doj;

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public EmployeeModel(int id, String employeename, String employeecode, String address, int salary, String companyname, String doj) {
        this.id = id;
        this.employeename = employeename;
        this.employeecode = employeecode;
        this.address = address;
        this.salary = salary;
        this.companyname = companyname;
        this.doj = doj;
    }
}
