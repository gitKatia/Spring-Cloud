package com.kat.service.valueconvert.model;

import java.math.BigDecimal;

public class ValueConversionBean {
	
	private Long id;
	private String fromUnit;
	private String toUnit;
	private BigDecimal conversionFactor;
	private int port;
	private BigDecimal value;
	private BigDecimal equivalentValue;
	
	public ValueConversionBean() {}

	public ValueConversionBean(Long id, String fromUnit, String toUnit, BigDecimal conversionFactor, int port,
			BigDecimal value, BigDecimal equivalentValue) {
		this.id = id;
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.conversionFactor = conversionFactor;
		this.port = port;
		this.value = value;
		this.equivalentValue = equivalentValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getEquivalentValue() {
		return equivalentValue;
	}

	public void setEquivalentValue(BigDecimal equivalentValue) {
		this.equivalentValue = equivalentValue;
	}

	@Override
	public String toString() {
		return "ValueConversionBean [fromUnit=" + fromUnit + ", toUnit=" + toUnit + ", conversionFactor="
				+ conversionFactor + ", port=" + port + ", value=" + value + ", equivalentValue="
				+ equivalentValue + "]";
	}


}
