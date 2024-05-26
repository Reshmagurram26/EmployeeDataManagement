package com.employee.datadetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EntityScan("com.employee.datadetails.entity")
public class DataDetailsApplication {
	public static void main(String[] args) {  
		SpringApplication.run(DataDetailsApplication.class, args);
	}

}
