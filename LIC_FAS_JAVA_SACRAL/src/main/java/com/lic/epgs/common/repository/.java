package com.lic.epgs.common.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.lic.epgs.common.dto.ProductVariantDetailsDto;

@Repository
public class GetVariantMappingCommonRepository {
    
    private static final Logger logger = LoggerFactory.getLogger(GetVariantMappingCommonRepository.class);
	
	public List<ProductVariantDetailsDto> getVariantMapping(String sourceVariant) {
		
		logger.info("Start getVariantMapping()");
		
		//Add code to retrieve the product variant details for a given source variant
		
		logger.info("End getVariantMapping()");
		
		return null;
	}
}