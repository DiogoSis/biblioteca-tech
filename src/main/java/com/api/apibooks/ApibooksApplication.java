package com.api.apibooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApibooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibooksApplication.class, args);
	}

}
