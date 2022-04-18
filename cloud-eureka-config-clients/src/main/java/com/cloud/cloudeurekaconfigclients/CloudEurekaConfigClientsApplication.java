package com.cloud.cloudeurekaconfigclients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudEurekaConfigClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudEurekaConfigClientsApplication.class, args);
	}
	@Value("${username}")
	String username;

	@Value("${userpassword}")
	String userpassword;

	@RequestMapping(value = "/hi")
	public String hi(){
		return username+ "<===>" + userpassword;
	}

}
