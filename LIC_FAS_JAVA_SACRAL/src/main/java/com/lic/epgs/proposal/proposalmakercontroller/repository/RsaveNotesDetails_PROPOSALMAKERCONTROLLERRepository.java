package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.RsaveNotesDetails_PROPOSALMAKERCONTROLLER;

@Repository
public interface RsaveNotesDetails_PROPOSALMAKERCONTROLLERRepository extends JpaRepository<RsaveNotesDetails_PROPOSALMAKERCONTROLLER, Long> {
    RsaveNotesDetails_PROPOSALMAKERCONTROLLER findByProposalId(Long proposalId);
    void deleteByProposalId(Long proposalId);
}