package com.demo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.student.model.Student;
import com.demo.student.service.StudentService;

@RestController
public class StudentController {

	/*add StudentService studentService to call the service layer saveStudent(s) method 
	 * @Autowired StudentService studentService karun apan service layer la connect hoto controller madhun */
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student s) {
		return studentService.saveStudent(s);
	}
	
	
}
