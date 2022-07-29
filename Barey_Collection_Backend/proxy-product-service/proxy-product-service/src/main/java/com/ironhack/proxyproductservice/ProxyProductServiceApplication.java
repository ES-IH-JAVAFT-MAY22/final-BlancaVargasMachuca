package com.ironhack.proxyproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProxyProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyProductServiceApplication.class, args);
	}

}
