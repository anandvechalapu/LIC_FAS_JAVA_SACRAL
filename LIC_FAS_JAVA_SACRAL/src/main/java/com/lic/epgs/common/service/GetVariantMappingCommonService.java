package com.lic.epgs.common.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.common.dto.ProductVariantDetailsDto;
import com.lic.epgs.common.repository.GetVariantMappingCommonRepository;

@Service
public class GetVariantMappingCommonService {
	
	private static final Logger logger = LoggerFactory.getLogger(GetVariantMappingCommonService.class);
	
	@Autowired
	private GetVariantMappingCommonRepository getVariantMappingCommonRepository;
	
	public List<ProductVariantDetailsDto> getVariantMapping(String sourceVariant) {
		
		logger.info("Start getVariantMapping()");
		
		List<ProductVariantDetailsDto> productVariantDetailsDtoList = getVariantMappingCommonRepository.getVariantMapping(sourceVariant);
		
		logger.info("End getVariantMapping()");
		
		return productVariantDetailsDtoList;
	}

}