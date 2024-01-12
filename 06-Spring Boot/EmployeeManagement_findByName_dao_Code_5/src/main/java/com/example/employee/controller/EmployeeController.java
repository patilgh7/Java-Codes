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

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
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
	
	/* Optional<Employee> emp he Optional class return karat aslyan apan direct emp object return karu shakat nahi
	 * tyasathi emp.get() karav lagat
	 * ==================================================================================================
	 * @GetMapping("/getById/{id}") -> getById katana /{path variable} dyava lagto
	 * 
	 * ani aplya getById() method chya parameter madhe ha id apla path variable ahe he sangav lagat
	 * so @PathVariable("id")  he anootation lavato apan method parameter madhe
	 * ===============================================================================================
	 * id present asel tarach khalcha code run hoto 
	 * ↓
	 *	
	 *  @GetMapping("/getById/{id}")
		public Employee getEmployeeById(@PathVariable("id") Long id) {
	
		Optional<Employee> emp = employeeService.getEmployeeById(id);
		
		return emp.get();
		}
		 
	 *
	 * ===========================================================================================
	 * 
	 * id present nasel ani error ala tar to handle karnyacha code yat apan ResponseEntity<T> vaparato 
	 * 
	 * <T> -> POJO class Employee dyaych
	 * 
	 * id nasel tar status handle karun lihlela code
	 * 
	 * @GetMapping("/getById/{id}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
	
		Optional<Employee> emp = employeeService.getEmployeeById(id);
		
		if(emp.isPresent()) {
			return new ResponseEntity<>(emp.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		} 
	 * 
	 * 
	 * 
	 * 
	 * */
	
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
		employeeService.deleteEmployee(id);
	}
	
	
	// 6.getByName
	
	@GetMapping("/getByName/{employeeName}")
	public List<Employee> getByName (@PathVariable("employeeName") String employeeName){
		
		return employeeService.getByName(employeeName);
	}
	
	
	
	// 7.getByName with starting with initial
	
	@GetMapping("/getByNameInitial/{employeeName}")
	public List<Employee> getByNameInitial (@PathVariable("employeeName") String employeeName){
		
		return employeeService.getByNameInitial(employeeName);
	}
	
	
}
