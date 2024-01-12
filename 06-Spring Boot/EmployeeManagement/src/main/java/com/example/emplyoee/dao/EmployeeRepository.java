package com.example.emplyoee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emplyoee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}



