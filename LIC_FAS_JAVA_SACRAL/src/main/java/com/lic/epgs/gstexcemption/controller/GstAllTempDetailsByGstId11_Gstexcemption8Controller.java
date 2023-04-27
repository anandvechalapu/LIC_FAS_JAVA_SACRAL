package com.lic.epgs.gstexcemption.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstAllTempDetailsByGstId11_Gstexcemption8;
import com.lic.epgs.gstexcemption.service.GstAllTempDetailsByGstId11_Gstexcemption8Service;

@RestController
public class GstAllTempDetailsByGstId11_Gstexcemption8Controller {

	@Autowired
	private GstAllTempDetailsByGstId11_Gstexcemption8Service gstAllTempDetailsByGstId11_Gstexcemption8Service;
	
	@GetMapping("/gstexcemption/{gstExemptionId}")
	public Optional<GstAllTempDetailsByGstId11_Gstexcemption8> getGstExemptionId(@PathVariable Long gstExemptionId){
		return gstAllTempDetailsByGstId11_Gstexcemption8Service.getGstExemptionId(gstExemptionId);
	}
	
}