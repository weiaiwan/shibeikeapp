package com.gbicc.shibeikeapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.gbicc.shibeikeapp.dao")
@EnableDiscoveryClient
public class ShibeikeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShibeikeappApplication.class, args);
	}
}
