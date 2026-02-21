package com.health.dental_management_system_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DentalManagementSystemBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DentalManagementSystemBeApplication.class, args);
	}

}
