package com.lic.epgs.proposal.proposalcheckercontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalcheckercontroller.model.Proposal;
import com.lic.epgs.proposal.proposalcheckercontroller.service.ProposalCheckerControllerService;

@RestController
@RequestMapping("/proposals")
public class ProposalCheckerController {
    
    @Autowired
    private ProposalCheckerControllerService proposalCheckerControllerService;
    
    @GetMapping("/{proposalId}")
    public ResponseEntity<Proposal> getProposal(@PathVariable("proposalId") Long proposalId) {
        Optional<Proposal> optionalProposal = proposalCheckerControllerService.getProposal(proposalId);
        if (optionalProposal.isPresent()) {
            return new ResponseEntity<Proposal>(optionalProposal.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/approve")
    public ResponseEntity<Object> approveProposal(@RequestBody Proposal proposal) {
        int count = proposalCheckerControllerService.approveProposal(proposal.getProposalId(), proposal.getModifiedBy());
        if (count == 1) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}