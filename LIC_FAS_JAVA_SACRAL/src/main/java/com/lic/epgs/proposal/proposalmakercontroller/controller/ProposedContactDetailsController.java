package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.dto.MPHContactPersonDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposedContactDetailsService;

@RestController
@RequestMapping("/proposal")
public class ProposedContactDetailsController {

    @Autowired
    private ProposedContactDetailsService proposedContactDetailsService;

    @GetMapping("/{proposalId}/contact-person/{contactPersonId}")
    public List<MPHContactPersonDetailsDto> findByProposalIdAndContactPersonIdOrderByContactPersonIdDesc(
            @PathVariable Long proposalId, @PathVariable Long contactPersonId) {
        return proposedContactDetailsService.findByProposalIdAndContactPersonIdOrderByContactPersonIdDesc(proposalId, contactPersonId);
    }

    @GetMapping("/{proposalId}/active/{active}")
    public List<MPHContactPersonDetailsDto> findByProposalIdAndActiveOrderByContactPersonIdDesc(@PathVariable Long proposalId,
            @PathVariable Boolean active) {
        return proposedContactDetailsService.findByProposalIdAndActiveOrderByContactPersonIdDesc(proposalId, active);
    }

}