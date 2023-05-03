package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;
import com.lic.epgs.proposal.proposalmakercontroller.repository.ProposalRepository;

@Service
public class ProposalService {

  @Autowired
  private ProposalRepository proposalRepository;

  public Proposal getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(int proposalNumber) {
    return proposalRepository.getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(proposalNumber);
  }

}