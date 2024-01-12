package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class JavaConfig {
	
	@Bean(name = "stud")
	public Student getStudent() {
		Student student = new Student();
		student.setId(101);
		student.setName("Ram");
		return student;
	}
	


}
