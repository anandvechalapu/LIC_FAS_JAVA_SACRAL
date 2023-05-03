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
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.model.Lead;
import com.lic.epgs.proposal.proposalmakercontroller.service.GetProductAndChannelDetailsProposalMakerControllerService;

@RestController
public class GetProductAndChannelDetailsProposalMakerController {
 
    @Autowired
    private GetProductAndChannelDetailsProposalMakerControllerService getProductAndChannelDetailsProposalMakerControllerService;
 
    @GetMapping("/leads")
    public List<Lead> findAll() {
        return getProductAndChannelDetailsProposalMakerControllerService.findAll();
    }
 
    @GetMapping("/leads/{leadId}")
    public Optional<Lead> findById(@PathVariable Long leadId) {
        return getProductAndChannelDetailsProposalMakerControllerService.findById(leadId);
    }
 
    @PostMapping("/leads")
    public Lead save(@RequestBody Lead lead) {
        return getProductAndChannelDetailsProposalMakerControllerService.save(lead);
    }
 
    @PutMapping("/leads/{leadId}")
    public Lead update(@PathVariable Long leadId, @RequestBody Lead lead) {
        return getProductAndChannelDetailsProposalMakerControllerService.save(lead);
    }
 
    @DeleteMapping("/leads/{leadId}")
    public void deleteById(@PathVariable Long leadId) {
        getProductAndChannelDetailsProposalMakerControllerService.deleteById(leadId);
    }
 
    @GetMapping("/leads/findByLeadId/{leadId}")
    public List<Lead> findByLeadId(@PathVariable Long leadId) {
        return getProductAndChannelDetailsProposalMakerControllerService.findByLeadId(leadId);
    }
}