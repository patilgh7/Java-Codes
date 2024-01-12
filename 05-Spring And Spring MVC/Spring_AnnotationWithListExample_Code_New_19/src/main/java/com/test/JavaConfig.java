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
	
	@Bean(name="stud")
	public Student getStudent() {
		
		Student student = new Student(listOfNames());
		return student;	
	}
	
	
	@Bean
	public List<String> listOfNames(){
		
		List<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Geeta");
		
		return list;
		
		//return Arrays.asList("Ram","Shyam","Geeta");     // .... This is another way of writing
	}

}
