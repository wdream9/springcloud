package com.cloud;

import com.api.service.StudentService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import java.util.concurrent.ThreadPoolExecutor;

@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
public class CloudDubboStudentProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDubboStudentProviderApplication.class, args);
	}

}
