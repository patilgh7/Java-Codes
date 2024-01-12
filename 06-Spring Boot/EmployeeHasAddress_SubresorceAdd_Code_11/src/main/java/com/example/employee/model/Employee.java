package com.example.employee.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long employeeId;
	
	private String employeeName;
	
	private String employeeRole;
	
	@OneToOne(cascade = CascadeType.ALL)                      // change
	private Address address;

	/*
	 * changes-> 
	 * 
	 *1) @OneToOne(cascade = CascadeType.ALL) 
	 *
	 *2) genearte getter setter for address
	 * 
	 *3) Create Address class in same com.example.employee.model package
	 *
	 *4) Go to service layer and only change in update method 
	 *  
	 * */

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + "]";
	}
	
	
	

}
