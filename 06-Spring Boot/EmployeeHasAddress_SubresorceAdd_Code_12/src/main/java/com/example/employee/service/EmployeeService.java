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


	// 4.Update Operation
	/*===========================================================================================================
	 * Normal code 
	public Employee updateEmployee(Employee newEntity, long id) {
		
		Employee oldEntity= employeeRepository.findById(id).get();   // old record get kel
		
		if(oldEntity != null) {
			oldEntity.setEmployeeName(newEntity.getEmployeeName());
			oldEntity.setEmployeeRole(newEntity.getEmployeeRole());
			employeeRepository.save(oldEntity);		
		}
		
		return oldEntity;
	}
	
	*/
	//=======================================================================================================
	
	
	/* mala employee role update karayacha ahe tar apala tyaveli employee name object null hoto 
	 * e.g. mi jason madhe ashi requestbody dili ->  "employeeRole":"Junior Developer"
	 * response ->     "employeeId": 2,
    				   "employeeName": null,
                       "employeeRole": "Junior Developer"
                       
	 *  "employeeName": null 
	 *  
	 *  e.g. mi jason madhe ashi requestbody dili -> "employeeName": "Amitabh"
	 *  
	 *  response ->   "employeeId": 1,
    			      "employeeName": "Amitabh",
    				  "employeeRole": null
    	"employeeRole": null zal so te overcome karnyasathi cha code		  
	 * 
	 * */
	
	// New Code with null handling
	
	public Employee updateEmployee(Employee newEntity, long id) {
		
		Employee oldEntity= employeeRepository.findById(id).get();   // old record get kel
		
		if(oldEntity != null) {
			if(newEntity.getEmployeeName()!= null) {
				oldEntity.setEmployeeName(newEntity.getEmployeeName());
			}
			
			
			if(newEntity.getEmployeeRole()!=null) { 
				oldEntity.setEmployeeRole(newEntity.getEmployeeRole());
			}
			
			// change for address entity
			
			if(newEntity.getAddress().getCity() != null) {
				oldEntity.getAddress().setCity(newEntity.getAddress().getCity());
			}
			
			if(newEntity.getAddress().getState() != null) {
				oldEntity.getAddress().setState(newEntity.getAddress().getState());
			}
			
			
			employeeRepository.save(oldEntity);		
		}
		
		return oldEntity;
	}


	public void deleteEmployee(long id) {
		
		Employee oldEntity = employeeRepository.findById(id).get();
		
		if(oldEntity != null) {
			employeeRepository.delete(oldEntity);
		}
		
	}


	



	
	
	
}
