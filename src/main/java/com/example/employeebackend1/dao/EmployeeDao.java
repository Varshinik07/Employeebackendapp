package com.example.employeebackend1.dao;

import com.example.employeebackend1.model.EmployeeModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
    @Modifying
    @Query(value = "DELETE FROM `employee` WHERE `id`= :id",nativeQuery = true)
    void deleteemployeeById(Integer id);

    @Query(value = "SELECT `id`, `address`, `companyname`, `doj`, `employeecode`, `employeename`, `salary` FROM `employee` WHERE `employeename`= :employeename",nativeQuery = true)
    List<EmployeeModel>searchemployee(String employeename);
}
