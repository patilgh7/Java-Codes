package com.example.employee.interceptors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RecordExceptionController {

	@ExceptionHandler(value = RecordNotFoundException.class)
	public ResponseEntity<Object> exception (RecordNotFoundException ex){
		
		return new ResponseEntity<> ("Record Nahi Milat Ahe", HttpStatus.NOT_FOUND);
	}
	
	

}
