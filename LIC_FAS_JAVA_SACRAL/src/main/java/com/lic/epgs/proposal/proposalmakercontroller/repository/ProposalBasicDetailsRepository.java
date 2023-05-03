package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.dto.ProposalBasicDetailsDto;
import com.lic.epgs.proposal.proposalmakercontroller.entity.ProposalBasicDetailTempEntity;

@Repository
public interface ProposalBasicDetailsRepository extends JpaRepository<ProposalBasicDetailTempEntity, Long> {

    @Modifying
    @Query("UPDATE ProposalBasicDetailTempEntity p SET p.isActive = false WHERE p.proposalId = :proposalId")
    public int deactivateProposal(@Param("proposalId") long proposalId);

    @Modifying
    @Query("UPDATE ProposalBasicDetailTempEntity p SET p.proposalNumber = :proposalNumber, p.proposalDate = :proposalDate WHERE p.proposalId = :proposalId")
    public int updateProposal(@Param("proposalNumber") String proposalNumber, @Param("proposalDate") String proposalDate,
            @Param("proposalId") long proposalId);

    @Modifying
    @Query("INSERT INTO ProposalBasicDetailTempEntity (proposalNumber, proposalDate, customerId) VALUES(:proposalNumber, :proposalDate, :customerId)")
    public int saveProposal(@Param("proposalNumber") String proposalNumber, @Param("proposalDate") String proposalDate,
            @Param("customerId") long customerId);

    public ProposalBasicDetailTempEntity findByProposalId(long proposalId);

}