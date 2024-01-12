package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class JavaConfig {
	
	@Bean(name="stud")
	public Student getStudent() {
		
		Student student = new Student();
		return student;	
	}

}
