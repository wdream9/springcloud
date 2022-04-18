package com.cloud.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaProviderApplication.class, args);
	}

}
