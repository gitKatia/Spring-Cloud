package com.kat.service.valueconvert;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kat.service.valueconvert.model.ValueConversionBean;

@FeignClient(name="unit-conversion-service",url="localhost:8000")
public interface UnitConversionServiceProxy {
	
	@GetMapping(value="/unit-conversion/fromUnit/{fromUnit}/toUnit/{toUnit}")
	public ValueConversionBean getConversionObject(@PathVariable("fromUnit") String fromUnit,@PathVariable("toUnit") String toUnit);

}
