package com.lic.epgs.gstexcemption.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.gstexcemption.model.GstByProposalNumber23;
import com.lic.epgs.gstexcemption.service.GstByProposalNumber23Service;

@RestController
public class GstByProposalNumber23Controller {
	
	@Autowired
	private GstByProposalNumber23Service gstByProposalNumber23Service;
	
	@GetMapping("/gst-by-proposal-number-23")
	public GstByProposalNumber23 findByProposalNumber(@RequestParam Long proposalNumber) {
		return gstByProposalNumber23Service.findByProposalNumber(proposalNumber);
	}
	
	@GetMapping("/gst-by-proposal-number-23-and-type-of-client-and-status")
	public List<GstByProposalNumber23> findByProposalNumberAndTypeOfClientAndStatus(@RequestParam Long proposalNumber, @RequestParam String typeOfClient, @RequestParam Integer status) {
		return gstByProposalNumber23Service.findByProposalNumberAndTypeOfClientAndStatus(proposalNumber, typeOfClient, status);
	}
	
	@GetMapping("/gst-by-proposal-number-23-and-gst-exemption-category-is-null")
	public List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNull(@RequestParam Long proposalNumber) {
		return gstByProposalNumber23Service.findByProposalNumberAndGstExemptionCategoryIsNull(proposalNumber);
	}
	
	@GetMapping("/gst-by-proposal-number-23-and-gst-exemption-category-is-not-null")
	public List<GstByProposalNumber23> findByProposalNumberAndGstExemptionCategoryIsNotNull(@RequestParam Long proposalNumber) {
		return gstByProposalNumber23Service.findByProposalNumberAndGstExemptionCategoryIsNotNull(proposalNumber);
	}
	
	@GetMapping("/gst-by-proposal-number-23-and-invalid")
	public List<GstByProposalNumber23> findByProposalNumberAndInvalid(@RequestParam Long proposalNumber) {
		return gstByProposalNumber23Service.findByProposalNumberAndInvalid(proposalNumber);
	}

}