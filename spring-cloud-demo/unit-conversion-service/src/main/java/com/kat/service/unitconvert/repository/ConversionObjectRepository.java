package com.kat.service.unitconvert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kat.service.unitconvert.model.ConversionObject;

public interface ConversionObjectRepository extends JpaRepository<ConversionObject,Long>{

	ConversionObject findByFromUnitAndToUnit(String fromUnit,String toUnit);
}
