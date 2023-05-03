package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalOverallDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalMakerController4Service;

@RestController
@RequestMapping("/proposal")
public class ProposalMakerController4 {
 
    @Autowired
    private ProposalMakerController4Service proposalMakerController4Service;
 
    @PostMapping
    public ProposalOverallDetailsDto save(@RequestBody ProposalOverallDetailsDto proposalOverallDetailsDto) {
        return proposalMakerController4Service.save(proposalOverallDetailsDto);
    }
 
    @GetMapping("/{proposalId}")
    public Optional<ProposalOverallDetailsDto> findByProposalId(@PathVariable Long proposalId) {
        return proposalMakerController4Service.findByProposalId(proposalId);
    }
 
    @DeleteMapping("/{proposalId}")
    public void deleteByProposalId(@PathVariable Long proposalId) {
        proposalMakerController4Service.deleteByProposalId(proposalId);
    }
    
    @PutMapping
    public ProposalOverallDetailsDto update(@RequestBody ProposalOverallDetailsDto proposalOverallDetailsDto) {
        return proposalMakerController4Service.save(proposalOverallDetailsDto);
    }
 
    @GetMapping
    public List<ProposalOverallDetailsDto> findAll() {
        return proposalMakerController4Service.findAll();
    }
}