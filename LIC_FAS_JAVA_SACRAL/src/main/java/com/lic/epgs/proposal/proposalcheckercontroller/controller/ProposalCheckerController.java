package com.lic.epgs.proposal.proposalcheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalcheckercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalcheckercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalcheckercontroller.service.ProposalCheckerControllerService;

@RestController
public class ProposalCheckerController {

    @Autowired
    private ProposalCheckerControllerService proposalCheckerControllerService;

    @PostMapping("/sendToMaker")
    public ProposalBasicDetailsDto sendToMaker(@RequestBody Proposal proposal) {
        return proposalCheckerControllerService.sendToMaker(proposal);
    }

    @PostMapping("/markProposalAsInactive")
    public void markProposalAsInactive(@RequestBody Proposal proposal) {
        proposalCheckerControllerService.markProposalAsInactive(proposal);
    }

    @PostMapping("/updateProposalStatusAndWorkflowStatus")
    public void updateProposalStatusAndWorkflowStatus(@RequestBody Proposal proposal) {
        proposalCheckerControllerService.updateProposalStatusAndWorkflowStatus(proposal);
    }

    @PostMapping("/copyExistingProposal")
    public Proposal copyExistingProposal(@RequestBody Proposal proposal) {
        return proposalCheckerControllerService.copyExistingProposal(proposal);
    }

    @PostMapping("/updateMappedFilesForNewProposal")
    public void updateMappedFilesForNewProposal(@RequestBody Proposal proposal) {
        proposalCheckerControllerService.updateMappedFilesForNewProposal(proposal);
    }

    @PostMapping("/getProposalBasicDetails")
    public ProposalBasicDetailsDto getProposalBasicDetails(@RequestBody Proposal proposal) {
        return proposalCheckerControllerService.getProposalBasicDetails(proposal);
    }

    @PostMapping("/returnErrorIfProposalIsInvalid")
    public void returnErrorIfProposalIsInvalid(@RequestBody Proposal proposal) {
        proposalCheckerControllerService.returnErrorIfProposalIsInvalid(proposal);
    }

}