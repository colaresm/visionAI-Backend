package com.visonai.vision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisionApplication.class, args);
	}

}
