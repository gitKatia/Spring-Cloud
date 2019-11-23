package com.kat.service.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kat.service.test.model.TestConfiguration;


@RestController
public class TestConfigurationController {
	
	@Value("${test-service.firstname}")
	private String firstname;
	@Value("${test-service.surname}")
	private String surname;
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/test")
	public TestConfiguration retrieveNameFromConfiguration(){
		return new TestConfiguration(firstname,surname);
	}
	
	@GetMapping("/services")
	public List<String> getServicesURIs() {
		return discoveryClient.getServices();
	}
}
