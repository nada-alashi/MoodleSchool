package com.MoodleSchool.Calendar_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;



@SpringBootApplication
public class CalendarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalendarServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	private RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
