package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.Repository.ProposalMakerController4Repository;
import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalOverallDetailsDto;

@Service
public class ProposalMakerController4Service {
 
    @Autowired
    private ProposalMakerController4Repository proposalMakerController4Repository;
 
    public Optional<ProposalOverallDetailsDto> findByProposalId(Long proposalId) {
        return proposalMakerController4Repository.findByProposalId(proposalId);
    }
 
    public ProposalOverallDetailsDto save(ProposalOverallDetailsDto proposalOverallDetailsDto) {
        return proposalMakerController4Repository.save(proposalOverallDetailsDto);
    }
 
    public void deleteByProposalId(Long proposalId) {
        proposalMakerController4Repository.deleteByProposalId(proposalId);
    }
    
    public List<ProposalOverallDetailsDto> findAll() {
        return proposalMakerController4Repository.findAll();
    }
}