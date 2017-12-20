package com.zhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

// 通过注解@EnableEurekaClient 表明自己是一个eurekaclient.
@EnableEurekaClient
@SpringBootApplication
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
}
