package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

	@Autowired(required = false)
	private List<String> listOfNames;

	
	// Constructor Based Injection
	
	public Student(List<String> listOfNames) {
		super();
		this.listOfNames = listOfNames;
	}

	@Override
	public String toString() {
		return "Student [listOfNames=" + listOfNames + "]";
	}
	
	
	
	
	
	

}
