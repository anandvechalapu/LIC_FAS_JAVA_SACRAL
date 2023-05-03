package com.lic.epgs.proposal.proposalmakercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalBasicDetailsRepository;
import com.lic.epgs.proposal.proposalmakercontroller.entity.ProposalBasicDetailTempEntity;

@Service
public class ProposalBasicDetailsService {

    @Autowired
    ProposalBasicDetailsRepository proposalBasicDetailsRepository;

    public List<ProposalBasicDetailTempEntity> getAllProposals() {
        return proposalBasicDetailsRepository.findAll();
    }

    public ProposalBasicDetailTempEntity getProposal(Long proposalId) {
        return proposalBasicDetailsRepository.findByProposalId(proposalId);
    }

    public int deactivateProposal(Long proposalId) {
        return proposalBasicDetailsRepository.deactivateProposal(proposalId);
    }

    public int updateProposal(ProposalBasicDetailsDto proposalBasicDetailsDto) {
        return proposalBasicDetailsRepository
                .updateProposal(proposalBasicDetailsDto.getProposalNumber(), proposalBasicDetailsDto.getProposalDate(), proposalBasicDetailsDto.getProposalId());
    }

    public int saveProposal(ProposalBasicDetailsDto proposalBasicDetailsDto) {
        return proposalBasicDetailsRepository
                .saveProposal(proposalBasicDetailsDto.getProposalNumber(), proposalBasicDetailsDto.getProposalDate(), proposalBasicDetailsDto.getCustomerId());
    }

}