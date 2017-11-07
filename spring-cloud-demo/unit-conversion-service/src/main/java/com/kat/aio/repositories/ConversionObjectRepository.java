package com.kat.aio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kat.aio.model.ConversionObject;

public interface ConversionObjectRepository extends JpaRepository<ConversionObject,Long>{

	ConversionObject findByFromUnitAndToUnit(String fromUnit,String toUnit);
}
