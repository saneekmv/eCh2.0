package com.aeologic.echallan.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EchallanServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchallanServiceRegisterApplication.class, args);
	}

}
