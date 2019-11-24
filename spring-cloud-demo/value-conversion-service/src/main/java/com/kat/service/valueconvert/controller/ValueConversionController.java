package com.kat.service.valueconvert.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kat.service.valueconvert.UnitConversionServiceProxy;
import com.kat.service.valueconvert.model.ValueConversionBean;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ValueConversionController {
	
	@Autowired
	private UnitConversionServiceProxy unitConversionServiceProxy;
	
	@HystrixCommand(fallbackMethod="getValueConversionBeanFallback")
	//http://localhost:8100/value-conversion/fromUnit/m/toUnit/mm/value/2
	@GetMapping(value="/value-conversion/fromUnit/{fromUnit}/toUnit/{toUnit}/value/{value}")
	public ValueConversionBean getValueConversionBean(@PathVariable("fromUnit") String fromUnit, 
			@PathVariable("toUnit") String toUnit, @PathVariable("value") BigDecimal value) {
		
		ValueConversionBean vcb = unitConversionServiceProxy.getConversionObject(fromUnit, toUnit);
		Long id = vcb.getId();
		BigDecimal conversionFactor = vcb.getConversionFactor();
		int port = vcb.getPort();
		return new ValueConversionBean(id,fromUnit,toUnit,conversionFactor,port,value,conversionFactor.multiply(value));
	}
	
	public ValueConversionBean getValueConversionBeanFallback(String fromUnit, String toUnit, BigDecimal value) {
		// Log error message
		ValueConversionBean vcb = new ValueConversionBean();
		vcb.setFromUnit(fromUnit);
		vcb.setToUnit(toUnit);
		vcb.setValue(value);
		vcb.setPort(0);
		vcb.setConversionFactor(BigDecimal.ZERO);
		vcb.setEquivalentValue(BigDecimal.ZERO);
		return vcb;
	}
	
}
