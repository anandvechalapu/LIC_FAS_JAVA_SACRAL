package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.Proposal;

@Repository
public interface ProposalRepository extends JpaRepository<Proposal, Integer> {

  Proposal getProposalDetailsByProposalNumber_PROPOSALMAKERCONTROLLER18(int proposalNumber);

}