package com.lic.epgs.proposal.proposalmakercontroller.controller;

import com.lic.epgs.proposal.proposalmakercontroller.entity.ProposalCommonSearchForAnnuity;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalCommonSearchForAnnuityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/annuity-proposals")
public class ProposalCommonSearchForAnnuityController {

    @Autowired
    private ProposalCommonSearchForAnnuityService proposalCommonSearchForAnnuityService;

    @GetMapping
    public List<ProposalCommonSearchForAnnuity> getAnnuityProposals(@RequestParam String unitCode, @RequestParam Integer pageCount, @RequestParam Integer limit) {
        return proposalCommonSearchForAnnuityService.getAnnuityProposals(unitCode, pageCount, limit);
    }

}