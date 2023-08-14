package com.stackspot.content.techinterview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TechInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechInterviewApplication.class, args);
	}

}
