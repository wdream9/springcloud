package com.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class CloudEurekaConsumerResttemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaConsumerResttemplateApplication.class, args);
	}

}
