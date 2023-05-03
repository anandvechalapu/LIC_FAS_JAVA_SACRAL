package com.lic.epgs.proposal.proposalmakercontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.entity.ProposalBasicDetailTempEntity;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalBasicDetailsService;

@RestController
@RequestMapping("/proposal")
public class ProposalBasicDetailsController {

    @Autowired
    ProposalBasicDetailsService proposalBasicDetailsService;

    @GetMapping("/all")
    public ResponseEntity<List<ProposalBasicDetailTempEntity>> getAllProposals() {
        List<ProposalBasicDetailTempEntity> proposalBasicDetailTempEntities = proposalBasicDetailsService.getAllProposals();
        return new ResponseEntity<List<ProposalBasicDetailTempEntity>>(proposalBasicDetailTempEntities, HttpStatus.OK);
    }

    @GetMapping("/{proposalId}")
    public ResponseEntity<ProposalBasicDetailTempEntity> getProposal(@PathVariable Long proposalId) {
        ProposalBasicDetailTempEntity proposalBasicDetailTempEntity = proposalBasicDetailsService.getProposal(proposalId);
        return new ResponseEntity<ProposalBasicDetailTempEntity>(proposalBasicDetailTempEntity, HttpStatus.OK);
    }

    @DeleteMapping("/{proposalId}")
    public ResponseEntity<Integer> deactivateProposal(@PathVariable Long proposalId) {
        int deactivateProposal = proposalBasicDetailsService.deactivateProposal(proposalId);
        return new ResponseEntity<Integer>(deactivateProposal, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Integer> updateProposal(@RequestBody ProposalBasicDetailsDto proposalBasicDetailsDto) {
        int updateProposal = proposalBasicDetailsService.updateProposal(proposalBasicDetailsDto);
        return new ResponseEntity<Integer>(updateProposal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> saveProposal(@RequestBody ProposalBasicDetailsDto proposalBasicDetailsDto) {
        int saveProposal = proposalBasicDetailsService.saveProposal(proposalBasicDetailsDto);
        return new ResponseEntity<Integer>(saveProposal, HttpStatus.OK);
    }

}