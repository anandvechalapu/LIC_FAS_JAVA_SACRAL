package com.lic.epgs.gstexcemption.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.gstexcemption.dto.CommonResponseDto;
import com.lic.epgs.gstexcemption.entity.CategoryGSTNonApplicability20;
import com.lic.epgs.gstexcemption.repository.CategoryGSTNonApplicability20Repository;

@Service
public class CategoryGSTNonApplicability20Service {

	@Autowired
	private CategoryGSTNonApplicability20Repository categoryGSTNonApplicability20Repository;

	public List<CommonResponseDto> getGSTNonApplicabilityCategories(){
		return categoryGSTNonApplicability20Repository.getGSTNonApplicabilityCategories();
	}

}