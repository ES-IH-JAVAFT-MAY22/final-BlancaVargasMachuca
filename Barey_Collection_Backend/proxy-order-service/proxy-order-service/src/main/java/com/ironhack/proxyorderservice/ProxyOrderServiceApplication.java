package com.ironhack.proxyorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProxyOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyOrderServiceApplication.class, args);
	}

}
