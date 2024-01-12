package com.example.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.dao.EmployeeRepository;
import com.example.employee.interceptors.RecordNotFoundException;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@Autowired
	EmployeeRepository repo;                // change for exception handling
	
	// we handle exception in deleteById check
	
	
	// 1.Save Employee Or Add Employee
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	// 2. Get All Employee Record
	
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployeeDetails(){
		
		return employeeService.getAllEmployeeDetails();
	}
	
	
	// 3. Get By Id Employee Record
	
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id) {
	
		Optional<Employee> emp = employeeService.getEmployeeById(id);
		
		if(emp.isPresent()) {
			return new ResponseEntity<>(emp.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		} 
		
		
	}
	

	//  4.Update Operation
	
	@PutMapping("/update/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") long id) {
		return employeeService.updateEmployee(employee,id);
	}
	
	
	// 5.Delete Operation
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") long id) {
		
		if(! repo.existsById(id)) throw new RecordNotFoundException();   // exception handle existsById(id) -> predefined method present in repo
		
		employeeService.deleteEmployee(id);
	}
	
	
	
}
