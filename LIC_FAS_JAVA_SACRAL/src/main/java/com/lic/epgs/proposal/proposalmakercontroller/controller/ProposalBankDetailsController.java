package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalBankDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalBankDetailsService;

@RestController
@RequestMapping("/proposalBankDetails")
public class ProposalBankDetailsController {
 
    @Autowired
    private ProposalBankDetailsService proposalBankDetailsService;
 
    @DeleteMapping("/{proposalId}")
    public void deleteByProposalId(@PathVariable("proposalId") Long proposalId) {
        proposalBankDetailsService.deleteByProposalId(proposalId);
    }
 
    @GetMapping("/proposalId/{proposalId}")
    public List<ProposalBankDetails> findByProposalId(@PathVariable("proposalId") Long proposalId) {
        return proposalBankDetailsService.findByProposalId(proposalId);
    }
 
    @GetMapping("/contactPersonId/{contactPersonId}")
    public List<ProposalBankDetails> findByContactPersonId(@PathVariable("contactPersonId") Long contactPersonId) {
        return proposalBankDetailsService.findByContactPersonId(contactPersonId);
    }
 
    @GetMapping("/uniqueId/{uniqueId}")
    public Optional<ProposalBankDetails> findByUniqueId(@PathVariable("uniqueId") String uniqueId) {
        return proposalBankDetailsService.findByUniqueId(uniqueId);
    }
 
    @DeleteMapping("/uniqueId/{uniqueId}")
    public void deleteByUniqueId(@PathVariable("uniqueId") String uniqueId) {
        proposalBankDetailsService.deleteByUniqueId(uniqueId);
    }
}