package com.lic.epgs.proposal.proposalcheckercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.lic.epgs.proposal.proposalcheckercontroller.entity.Proposal;

@Repository
public interface ProposalCheckerControllerRepository extends JpaRepository<Proposal, Long> {
    
    @Modifying
    @Query("UPDATE Proposal p SET p.isApproved = true, p.modifiedBy = :modifiedBy WHERE p.proposalId = :proposalId")
    int approveProposal(@Param("proposalId") Long proposalId, @Param("modifiedBy") String modifiedBy);
}