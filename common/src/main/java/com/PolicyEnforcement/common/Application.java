package com.PolicyEnforcement.common;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.PolicyEnforcement.common.service","com.PolicyEnforcement.AdminService","com.PolicyEnforcement.EnforcementService"})
public class Application implements CommandLineRunner{


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
	}

}
