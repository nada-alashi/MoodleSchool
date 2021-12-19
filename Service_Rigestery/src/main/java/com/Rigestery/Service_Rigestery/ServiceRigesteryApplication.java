package com.Rigestery.Service_Rigestery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRigesteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRigesteryApplication.class, args);
	}

}
