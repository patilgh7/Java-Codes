package com.example.employee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	/*
	 * DAO layer la ith aplyakade Repository madhe finById() method readymade milate
	 * 
	 * pan jar aplyala sagale employee findByName() or findByRole() search karayche astil tar
	 * 
	 * tyasathi aplyala user defined methods lihavya lagtil findByName() or findByRole() sathi
	 *  
	 * */
	
	
	// findByEmployeeName
	
	List<Employee> findByEmployeeName(String employeeName);
	
	
	/* findByEmployeeName yat mala name intial deun search karaych ahe tyacase madhe StartingWith ha keyword
	 * lavayacha method la ki to automatically "/inital letter" dil ki find out karato
	 * 
	 * StartingWith keyword je use karato method madhe tyana -> Derived Query mhantat
	 * getBy hi pan ek Derived Query ahe
	 * 
	 * 
	 * */
	
	List<Employee> findByEmployeeNameStartingWith(String employeeName);
	
	
	/*
	 * Derived Queries:
	 * 
	 * getBy
	 * readBy
	 * StartingWith
	 * LessThan
	 * GreaterThan
	 * Between
	 * 
	 * 
	 * */
	
	
	
}
