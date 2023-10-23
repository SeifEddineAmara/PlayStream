package com.example.PlayStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayStreamApplication.class, args);
	}

}
