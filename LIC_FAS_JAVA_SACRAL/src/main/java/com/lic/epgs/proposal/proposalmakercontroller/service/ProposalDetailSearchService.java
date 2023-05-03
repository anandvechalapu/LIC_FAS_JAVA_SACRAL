package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.AccountingResponseDto;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalDetailSearchRepository;

@Service
public class ProposalDetailSearchService {
	
	@Autowired
	private ProposalDetailSearchRepository proposalDetailSearchRepository;
	
	public List<AccountingResponseDto> searchByProposalNumber(String proposalNumber) {
		return proposalDetailSearchRepository.findByProposalNumber(proposalNumber);
	}
	
	public List<AccountingResponseDto> searchByIntermediaryCode(String intermediaryCode) {
		return proposalDetailSearchRepository.findByIntermediaryCode(intermediaryCode);
	}
	
	public List<AccountingResponseDto> searchProposalDetailsByProposalNumber(String proposalNumber) {
		return proposalDetailSearchRepository.findProposalDetailsByProposalNumber(proposalNumber);
	}
	
	public List<AccountingResponseDto> searchProposalDetailsByIntermediaryCode(String intermediaryCode) {
		return proposalDetailSearchRepository.findProposalDetailsByIntermediaryCode(intermediaryCode);
	}

}