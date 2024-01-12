package com.example.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	// 1. Save method
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student); 
				
	}
	
	
	// 2. List of Students
	
	@GetMapping("/list")
	public List<Student> studentList(){
		
		return studentService.studentList();
	}
	
	
	// 3.Get By Id (Single Record Fetch)
	
	@GetMapping("/getById/{idcard}")
	public Optional<Student> getByIdStudent(@PathVariable("idcard") int id) {
		
		return studentService.getByIdStudent(id);
		
	}
	
	
	// 4.Update Student Details
	
	@PutMapping("/update/{idcard}")
	public Student updateStudentDetails(@RequestBody Student student,@PathVariable("idcard") Integer id) {
		
		return studentService.updateStudentDetails(student, id);
	}
	
	// 5.Delete By Id
	@DeleteMapping("/delete/{idcard}")
	public void deleteById(@PathVariable("idcard") int id) {
		
		studentService.deleteById(id);
	}
	
	
}
