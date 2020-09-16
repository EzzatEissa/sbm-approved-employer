package com.sbm.approved.employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sbm.approved.employer")
public class SbmApprovedEmployerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmApprovedEmployerApplication.class, args);
	}

}
