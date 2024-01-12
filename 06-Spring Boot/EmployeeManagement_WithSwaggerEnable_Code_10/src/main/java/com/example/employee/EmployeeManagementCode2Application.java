package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2                // change for swagger enable
@SpringBootApplication
public class EmployeeManagementCode2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementCode2Application.class, args);
	}
	
	@Bean   // change for swagger here we are writing docket api 
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2).select().
				apis(RequestHandlerSelectors.basePackage("com.example.employee")).build();
		
	}
	

}
