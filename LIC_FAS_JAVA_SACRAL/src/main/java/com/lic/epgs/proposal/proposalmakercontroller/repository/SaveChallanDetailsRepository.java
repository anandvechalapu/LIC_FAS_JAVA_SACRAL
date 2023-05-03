package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.entity.ChallanDetails;

@Repository
public interface SaveChallanDetailsRepository extends JpaRepository<ChallanDetails, Long> {

    ChallanDetails findByActiveTrueAndCreatedBy(String createdBy);

    void deleteByActiveTrueAndCreatedBy(String createdBy);

    ChallanDetails save(ChallanDetails challanDetails);
}