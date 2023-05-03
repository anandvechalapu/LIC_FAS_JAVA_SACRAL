package com.lic.epgs.proposal.proposalmakercontroller.service;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalBankDetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalBankDetailsRepository;

@Service
public class ProposalBankDetailsService {

    @Autowired
    private ProposalBankDetailsRepository proposalBankDetailsRepository;

    public void deleteByProposalId(Long proposalId) {
        proposalBankDetailsRepository.deleteByProposalId(proposalId);
    }

    public List<ProposalBankDetails> findByProposalId(Long proposalId) {
        return proposalBankDetailsRepository.findByProposalId(proposalId);
    }

    public List<ProposalBankDetails> findByContactPersonId(Long contactPersonId) {
        return proposalBankDetailsRepository.findByContactPersonId(contactPersonId);
    }

    public Optional<ProposalBankDetails> findByUniqueId(String uniqueId) {
        return proposalBankDetailsRepository.findByUniqueId(uniqueId);
    }

    public void deleteByUniqueId(String uniqueId) {
        proposalBankDetailsRepository.deleteByUniqueId(uniqueId);
    }

}