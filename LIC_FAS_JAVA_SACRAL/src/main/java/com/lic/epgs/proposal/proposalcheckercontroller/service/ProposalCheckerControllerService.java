package com.lic.epgs.proposal.proposalcheckercontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalcheckercontroller.entity.Proposal;
import com.lic.epgs.proposal.proposalcheckercontroller.repository.ProposalCheckerControllerRepository;

@Service
public class ProposalCheckerControllerService {
    
    @Autowired
    private ProposalCheckerControllerRepository proposalCheckerControllerRepository;
    
    public Optional<Proposal> getProposal(Long proposalId) {
        return proposalCheckerControllerRepository.findById(proposalId);
    }
    
    public int approveProposal(Long proposalId, String modifiedBy) {
        return proposalCheckerControllerRepository.approveProposal(proposalId, modifiedBy);
    }
}