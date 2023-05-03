package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.MPHContactPersonDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposedContactDetailsRepository;

@Service
public class ProposedContactDetailsService {

    @Autowired
    private ProposedContactDetailsRepository proposedContactDetailsRepository;

    public List<MPHContactPersonDetailsDto> findByProposalIdAndContactPersonIdOrderByContactPersonIdDesc(Long proposalId,
            Long contactPersonId) {
        return proposedContactDetailsRepository.findByProposalIdAndContactPersonIdOrderByContactPersonIdDesc(proposalId, contactPersonId);
    }

    public List<MPHContactPersonDetailsDto> findByProposalIdAndActiveOrderByContactPersonIdDesc(Long proposalId,
            Boolean active) {
        return proposedContactDetailsRepository.findByProposalIdAndActiveOrderByContactPersonIdDesc(proposalId, active);
    }

}