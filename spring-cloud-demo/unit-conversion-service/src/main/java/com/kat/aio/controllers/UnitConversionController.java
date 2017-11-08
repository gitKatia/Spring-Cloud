package com.kat.aio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kat.aio.model.ConversionObject;
import com.kat.aio.repositories.ConversionObjectRepository;

@RestController
public class UnitConversionController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private ConversionObjectRepository conversionObjectRepository;
	
	//http://localhost:8000/unit-conversion/fromUnit/m/toUnit/mm
	@GetMapping(value="/unit-conversion/fromUnit/{fromUnit}/toUnit/{toUnit}")
	public ConversionObject getConversionObject(@PathVariable("fromUnit") String fromUnit,@PathVariable("toUnit") String toUnit) {
		
		ConversionObject conversionObject = conversionObjectRepository.findByFromUnitAndToUnit(fromUnit, toUnit);
		conversionObject.setPort(Integer.parseInt(env.getProperty("server.port")));
		System.out.println(conversionObject);
		return conversionObject;
	}

}
