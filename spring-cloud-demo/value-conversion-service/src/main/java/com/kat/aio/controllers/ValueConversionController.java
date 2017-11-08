package com.kat.aio.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kat.aio.UnitConversionServiceProxy;
import com.kat.aio.model.ValueConversionBean;

@RestController
public class ValueConversionController {
	
	@Autowired
	private UnitConversionServiceProxy unitConversionServiceProxy;
	
	//http://localhost:8100/value-conversion/fromUnit/m/toUnit/mm/quantity/2
	@GetMapping(value="/value-conversion/fromUnit/{fromUnit}/toUnit/{toUnit}/quantity/{quantity}")
	public ValueConversionBean getValueConversionBean(@PathVariable("fromUnit") String fromUnit, 
			@PathVariable("toUnit") String toUnit, @PathVariable("quantity") BigDecimal quantity) {
		
		ValueConversionBean vcb = unitConversionServiceProxy.getConversionObject(fromUnit, toUnit);
		Long id = vcb.getId();
		BigDecimal conversionFactor = vcb.getConversionFactor();
		int port = vcb.getPort();
		return new ValueConversionBean(id,fromUnit,toUnit,conversionFactor,port,quantity,conversionFactor.multiply(quantity));
	}
	
}
