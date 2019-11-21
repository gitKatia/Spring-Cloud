package com.kat.service.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kat.service.test.model.TestConfiguration;

@RestController
public class TestConfigurationController {
	
	@Value("${test-service.firstname}")
	private String firstname;
	@Value("${test-service.surname}")
	private String surname;

	@GetMapping("/test")
	public TestConfiguration retrieveNameFromConfiguration(){
		return new TestConfiguration(firstname,surname);
	}
}
