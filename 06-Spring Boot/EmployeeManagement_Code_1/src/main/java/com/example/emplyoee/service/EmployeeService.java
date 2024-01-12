package com.example.emplyoee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emplyoee.dao.EmployeeRepository;
import com.example.emplyoee.model.Employee;


/*
 * Hi Service Layer ahe so apan yala @Service annotation laval
 * 
 * Aplyala Employee cha data save karaycha ahe so aplyala 1st lagnar Employee cha object mhanje aplya
 * POJO class employee cha object (Employee employee).
 * 2nd save method lagnar ahe so hi save method hi aplya EmployeeRepository cha parent interface JpaRepository
 * chya pan CrudRepository ya interface kade so basically mala ithe save method havi ahe.
 * Ani hi save method EmployeeRepository ha apan banvlela Interface milvun denar
 * mhanun apan=> EmployeeRepository employeeRepository;   asa object create kela
 * ======================================================================================================
 *So apan saveEmployee hi apli method lihnar
 *
 *public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
 *
 *========================================================================================================
 *
 *@Autowired
	EmployeeRepository employeeRepository;
 *
 *Autowired he annotation apan EmployeeRepository var laval ahe karan hi "dao layer" ahe
 *
 *public class EmployeeService hi apli "Service layer" ahe
 *
 *Nehmi apan Varchya layer madhe jevha khalchya layer cha logic lihto tevha apan Khalachya layer cha object 
 *creat karun tyavar @Autowired lavato
 *
 *Simply apan ith service layer madhe apan dao layer chi save method vaparat ahe
 *
 *Techonology stack => Controller  => HTML/JSON kadun Ji pahili Request yenar ya front end kadun te handle Controller Karto
 *						 ↓                    ↓
 *					   Service            JSP/Servlet
 *						 ↓                    ↓
 *						Dao               Hibernate/JDBC
 *						 ↓                    ↓
 *						Database             MySQL
 *
 **/



@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}





