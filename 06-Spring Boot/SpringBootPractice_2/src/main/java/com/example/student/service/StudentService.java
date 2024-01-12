package com.example.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.dao.StudentRepository;
import com.example.student.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	// 1. Save method
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}
	
	// 2.List of Students
	
	public List<Student> studentList(){
		
		return studentRepository.findAll();
		
	}
	
	
	// 3.Get By Id (Single Record Fetch)
	
	public Optional<Student> getByIdStudent(Integer id) {
		
		return studentRepository.findById(id);
	}
	
	
	// 4.Update Student Details
	
	public Student updateStudentDetails(Student newEntity,Integer id) {
		
		Student oldEntity = studentRepository.findById(id).get();  // old record fetch of that particular id 
		
		if(oldEntity != null) {
			
			if(newEntity.getStudentName() != null) {
				oldEntity.setStudentName(newEntity.getStudentName());
			}
			
			if(newEntity.getStudentCollege() != null) {
				oldEntity.setStudentCollege(newEntity.getStudentCollege());
			}
			
			studentRepository.save(oldEntity);
		}
		
		return oldEntity;
		
	}

	
	// 5.Delete By Id
	
	public void deleteById(Integer id) {
		
		Student oldEntity = studentRepository.findById(id).get();
		
		if(oldEntity != null) {
			studentRepository.delete(oldEntity);
		}
		
	}
	
	
	
	
}
