package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.proposal.proposalmakercontroller.model.Proposal;

public interface ProposalRepository extends JpaRepository<Proposal, Long> {

    @Query("SELECT p FROM Proposal p LEFT JOIN FETCH p.customer c LEFT JOIN FETCH p.subCustomer sc LEFT JOIN FETCH p.trust t LEFT JOIN FETCH p.groupCustomer gc LEFT JOIN FETCH p.lead l LEFT JOIN FETCH p.proposalBasic pb LEFT JOIN FETCH p.proposalChannel pc LEFT JOIN FETCH p.proposalProduct pp LEFT JOIN FETCH p.bankAccount ba LEFT JOIN FETCH p.contactPerson cp LEFT JOIN FETCH p.address a WHERE p.id = ?1")
    Proposal getProposalOverallDetails_PROPOSALMAKERCONTROLLER34(Long proposalId);

}