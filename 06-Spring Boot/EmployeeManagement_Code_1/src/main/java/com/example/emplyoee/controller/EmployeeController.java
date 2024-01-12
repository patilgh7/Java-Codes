package com.example.emplyoee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.emplyoee.model.Employee;
import com.example.emplyoee.service.EmployeeService;

/*
 *@RestController = @Controller + @ResponseBody ch kam karto 
 * 
 * ==========================================================================================================
 *Autowired he annotation apan EmployeeService var laval ahe karan hi "service layer" ahe
 *
 *public class EmployeeController hi apli "Controller layer" ahe
 *
 *Nehmi apan Varchya layer madhe jevha khalchya layer cha logic lihto tevha apan Khalachya layer cha object 
 *creat karun tyavar @Autowired lavato
 *
 *Simply apan ith controller layer madhe apan service layer chi save method vaparat ahe
 * 
 *  ==========================================================================================================
 * 
 * @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)  => 1st way for request mapping  OR
 * 
 * @PostMapping("/saveEmployee") => 2nd way for request mapping
 * 
 *  ==========================================================================================================
 *  
 *  Json madhe request pathvun jar response
 * 
 *  "employeeId": 1,
    "employeeName": null,
    "employeeRole": null
 * 
 *  null response yet asel
 *  
 *  Solution => When using @PostMapping then  use @RequestBody annotation in method parameter 
 * 
 * @PostMapping("/saveEmployee")
 * public Employee saveEmployee(@RequestBody Employee employee)
 * 
 */  

 




@RestController 
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//  1) Employee Record save/create
	
	//@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}

@GetMapping("/")	
public String getDetails() {
		
		return "hi";
	}

}


