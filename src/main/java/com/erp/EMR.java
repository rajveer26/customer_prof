package com.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EMR extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(EMR.class, args);
	}

}
