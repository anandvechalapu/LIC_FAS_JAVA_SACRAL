package com.lic.epgs.gstexcemption.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.dto.GstPolicyNumberDto;
import com.lic.epgs.gstexcemption.service.GstExcemptionService;

@RestController
@RequestMapping("/gst-excemption")
public class GstExcemptionController {

	private final GstExcemptionService gstExcemptionService;
	
	public GstExcemptionController(GstExcemptionService gstExcemptionService) {
		this.gstExcemptionService = gstExcemptionService;
	}
	
	@GetMapping("/{proposalNumber}")
	public GstPolicyNumberDto getGstByProposalNo(@PathVariable String proposalNumber) {
		return gstExcemptionService.getGstByProposalNo(proposalNumber);
	}

}