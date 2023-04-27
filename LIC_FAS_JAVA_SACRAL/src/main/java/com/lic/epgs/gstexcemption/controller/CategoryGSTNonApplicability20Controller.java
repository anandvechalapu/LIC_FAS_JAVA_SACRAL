package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.dto.CommonResponseDto;
import com.lic.epgs.gstexcemption.service.CategoryGSTNonApplicability20Service;

@RestController
@RequestMapping(value = "/gstexcemption")
public class CategoryGSTNonApplicability20Controller {
	
	@Autowired
	private CategoryGSTNonApplicability20Service categoryGSTNonApplicability20Service;
	
	@GetMapping(value = "/categories")
	public List<CommonResponseDto> getGSTNonApplicabilityCategories(){
		return categoryGSTNonApplicability20Service.getGSTNonApplicabilityCategories();
	}

}