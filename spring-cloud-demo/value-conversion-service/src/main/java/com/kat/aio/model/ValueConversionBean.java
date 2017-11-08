package com.kat.aio.model;

import java.math.BigDecimal;

public class ValueConversionBean {
	
	private Long id;
	private String fromUnit;
	private String toUnit;
	private BigDecimal conversionFactor;
	private int port;
	private BigDecimal quantity;
	private BigDecimal equivalentQuantity;
	
	public ValueConversionBean() {}

	public ValueConversionBean(Long id, String fromUnit, String toUnit, BigDecimal conversionFactor, int port,
			BigDecimal quantity, BigDecimal equivalentQuantity) {
		this.id = id;
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.conversionFactor = conversionFactor;
		this.port = port;
		this.quantity = quantity;
		this.equivalentQuantity = equivalentQuantity;
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

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getEquivalentQuantity() {
		return equivalentQuantity;
	}

	public void setEquivalentQuantity(BigDecimal equivalentQuantity) {
		this.equivalentQuantity = equivalentQuantity;
	}

	@Override
	public String toString() {
		return "ValueConversionBean [fromUnit=" + fromUnit + ", toUnit=" + toUnit + ", conversionFactor="
				+ conversionFactor + ", port=" + port + ", quantity=" + quantity + ", equivalentQuantity="
				+ equivalentQuantity + "]";
	}


}
