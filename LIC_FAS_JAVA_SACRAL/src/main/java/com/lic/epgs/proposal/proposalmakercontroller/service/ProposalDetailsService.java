package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProposalDetailsService {

    @Autowired
    private ProposalDetailsRepository proposalDetailsRepository;

    public List<ProposalDetails> getExistingProposalDetailsList(String role, String unitCode) {
        return proposalDetailsRepository.getExistingProposalDetailsList(role, unitCode);
    }
}