package com.ironhack.eurekabareyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBareyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBareyServiceApplication.class, args);
	}

}
