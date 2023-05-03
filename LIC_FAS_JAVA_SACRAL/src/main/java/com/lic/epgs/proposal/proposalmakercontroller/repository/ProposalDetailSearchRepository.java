package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.proposal.proposalmakercontroller.AccountingResponseDto;

public interface ProposalDetailSearchRepository extends JpaRepository<AccountingResponseDto, Long> {
    
    // Method to search for a proposal by proposal number
    List<AccountingResponseDto> findByProposalNumber(String proposalNumber);
    
    // Method to search for a proposal by intermediary code
    List<AccountingResponseDto> findByIntermediaryCode(String intermediaryCode);
    
    // Method to retrieve relevant proposal details based on the proposal number provided
    List<AccountingResponseDto> findProposalDetailsByProposalNumber(String proposalNumber);
    
    // Method to retrieve all proposal details associated with an intermediary code
    List<AccountingResponseDto> findProposalDetailsByIntermediaryCode(String intermediaryCode);
}