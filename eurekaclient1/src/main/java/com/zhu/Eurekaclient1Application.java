package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
public class Eurekaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaclient1Application.class, args);
	}
}
