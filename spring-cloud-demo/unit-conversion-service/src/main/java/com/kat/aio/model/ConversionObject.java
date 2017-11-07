package com.kat.aio.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONVERSION_OBJECT")
public class ConversionObject {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="FROM_UNIT")
	private String fromUnit;
	@Column(name="TO_UNIT")
	private String toUnit;
	@Column(name="CONVERSION_FACTOR")
	private BigDecimal conversionFactor;
	@Column(name="PORT")
	private int port;
	
	public ConversionObject() {}

	public ConversionObject(Long id, String fromUnit, String toUnit, BigDecimal conversionFactor) {
		this.id = id;
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.conversionFactor = conversionFactor;
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

	@Override
	public String toString() {
		return "ConversionObject [fromUnit=" + fromUnit + ", toUnit=" + toUnit + ", conversionFactor="
				+ conversionFactor + ", port=" + port + "]";
	}
	

}
