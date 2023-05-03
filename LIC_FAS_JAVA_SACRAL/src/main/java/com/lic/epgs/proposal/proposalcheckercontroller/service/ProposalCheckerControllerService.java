package com.lic.epgs.proposal.proposalcheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalcheckercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalcheckercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalcheckercontroller.repository.ProposalCheckerControllerRepository;

@Service
public class ProposalCheckerControllerService {

    @Autowired
    private ProposalCheckerControllerRepository proposalCheckerControllerRepository;

    public ProposalBasicDetailsDto sendToMaker(Proposal proposal) {
        return proposalCheckerControllerRepository.sendToMaker(proposal);
    }

    public void markProposalAsInactive(Proposal proposal) {
        proposalCheckerControllerRepository.markProposalAsInactive(proposal);
    }

    public void updateProposalStatusAndWorkflowStatus(Proposal proposal) {
        proposalCheckerControllerRepository.updateProposalStatusAndWorkflowStatus(proposal);
    }

    public Proposal copyExistingProposal(Proposal proposal) {
        return proposalCheckerControllerRepository.copyExistingProposal(proposal);
    }

    public void updateMappedFilesForNewProposal(Proposal proposal) {
        proposalCheckerControllerRepository.updateMappedFilesForNewProposal(proposal);
    }

    public ProposalBasicDetailsDto getProposalBasicDetails(Proposal proposal) {
        return proposalCheckerControllerRepository.getProposalBasicDetails(proposal);
    }

    public void returnErrorIfProposalIsInvalid(Proposal proposal) {
        proposalCheckerControllerRepository.returnErrorIfProposalIsInvalid(proposal);
    }

}