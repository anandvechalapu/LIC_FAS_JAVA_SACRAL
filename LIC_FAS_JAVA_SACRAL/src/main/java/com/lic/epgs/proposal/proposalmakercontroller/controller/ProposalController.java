package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;

@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Integer> {
  Proposal getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(int proposalNumber);

}

package com.lic.epgs.proposal.proposalmakercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.service.ProposalService;

@RestController
@RequestMapping("/proposal")
public class ProposalController {

  @Autowired
  private ProposalService proposalService;

  @GetMapping("/{proposalNumber}")
  public ResponseEntity<Proposal> getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(
      @PathVariable int proposalNumber) {
    Proposal proposal = proposalService.getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(proposalNumber);
    return ResponseEntity.ok().body(proposal);
  }

  @PostMapping
  public ResponseEntity<Proposal> createProposal(@RequestBody Proposal proposal) {
    Proposal createdProposal = proposalService.createProposal(proposal);
    return ResponseEntity.ok().body(createdProposal);
  }

}