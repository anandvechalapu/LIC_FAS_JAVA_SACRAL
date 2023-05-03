package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalDetails;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProposalDetailsController {

    @Autowired
    private ProposalDetailsService proposalDetailsService;

    @GetMapping("/proposaldetails")
    public List<ProposalDetails> getExistingProposalDetailsList(@RequestParam String role, @RequestParam String unitCode) {
        return proposalDetailsService.getExistingProposalDetailsList(role, unitCode);
    }
}