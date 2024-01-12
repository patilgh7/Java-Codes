package com.demo.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.student.dao.StudentRepository;
import com.demo.student.model.Student;

@Service
public class StudentService {
	
	/* add StudentRepository studentRepository to use in our saveStudent method to call the exact save method from 
	 * dao layer-> JpaRepository save(s) method 
	 * @Autowired StudentRepository studentRepository karun apan dao layer la connect hoto service madhun
	 * 
	 * */
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student s) {
		return studentRepository.save(s);
	}

}
