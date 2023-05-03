package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.AccountingResponseDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalDetailSearchService;

@RestController
public class ProposalDetailSearchController {
	
	@Autowired
	private ProposalDetailSearchService proposalDetailSearchService;
	
	@GetMapping("/searchByProposalNumber")
	public List<AccountingResponseDto> searchByProposalNumber(@RequestParam String proposalNumber) {
		return proposalDetailSearchService.searchByProposalNumber(proposalNumber);
	}
	
	@GetMapping("/searchByIntermediaryCode")
	public List<AccountingResponseDto> searchByIntermediaryCode(@RequestParam String intermediaryCode) {
		return proposalDetailSearchService.searchByIntermediaryCode(intermediaryCode);
	}
	
	@GetMapping("/searchProposalDetailsByProposalNumber")
	public List<AccountingResponseDto> searchProposalDetailsByProposalNumber(@RequestParam String proposalNumber) {
		return proposalDetailSearchService.searchProposalDetailsByProposalNumber(proposalNumber);
	}
	
	@GetMapping("/searchProposalDetailsByIntermediaryCode")
	public List<AccountingResponseDto> searchProposalDetailsByIntermediaryCode(@RequestParam String intermediaryCode) {
		return proposalDetailSearchService.searchProposalDetailsByIntermediaryCode(intermediaryCode);
	}

}