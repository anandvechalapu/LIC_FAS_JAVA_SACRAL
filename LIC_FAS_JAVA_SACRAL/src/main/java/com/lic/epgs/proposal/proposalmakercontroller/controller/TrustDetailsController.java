package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDTO;
import com.lic.epgs.proposal.proposalmakercontroller.service.TrustDetailsService;

@RestController
@RequestMapping("/TrustDetailsController")
public class TrustDetailsController {

	@Autowired
	private TrustDetailsService trustDetailsService;
	
	@GetMapping("/getTrustNameListByCustomerId/{customerId}")
	public CommonResponseDTO getTrustNameListByCustomerId(@PathVariable(name="customerId") Long customerId){
		return trustDetailsService.getTrustNameListByCustomerId(customerId);
	}
	
}