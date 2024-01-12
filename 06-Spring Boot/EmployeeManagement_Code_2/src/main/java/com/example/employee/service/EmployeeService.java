package com.example.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.dao.EmployeeRepository;
import com.example.employee.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	// 1.Save  
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	
	// 2.Get All
	
	public List<Employee> getAllEmployeeDetails(){
		
		List<Employee> listEmp = employeeRepository.findAll();
		
		return listEmp;
		
		// OR return employeeRepository.findAll();  -> you can write like this also
		
	}
	
	// 3. Get By Id
	
	/* findById(id) hi method Optional class return karate
	 * */
	
	public Optional<Employee> getEmployeeById(Long id) {
		
		return employeeRepository.findById(id);
	}
	
	
}
