package com.lic.epgs.common.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.common.dto.ProductVariantDetailsDto;
import com.lic.epgs.common.service.GetVariantMappingCommonService;

@RestController
@RequestMapping("/variantMapping")
public class GetVariantMappingCommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(GetVariantMappingCommonController.class);
	
	@Autowired
	private GetVariantMappingCommonService getVariantMappingCommonService;
	
	@GetMapping("/{sourceVariant}")
	public List<ProductVariantDetailsDto> getVariantMapping(@PathVariable String sourceVariant) {
		
		logger.info("Start getVariantMapping()");
		
		List<ProductVariantDetailsDto> productVariantDetailsDtoList = getVariantMappingCommonService.getVariantMapping(sourceVariant);
		
		logger.info("End getVariantMapping()");
		
		return productVariantDetailsDtoList;
	}
}