package com.stackroute.eurekaserverpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerPatternApplication.class, args);
	}

}
