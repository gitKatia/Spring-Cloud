package com.kat.service.unitconvert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UnitConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConversionServiceApplication.class, args);
	}
}
