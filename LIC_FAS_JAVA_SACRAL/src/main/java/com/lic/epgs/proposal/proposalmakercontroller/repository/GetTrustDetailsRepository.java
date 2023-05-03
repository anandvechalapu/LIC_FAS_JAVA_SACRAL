package com.lic.epgs.proposal.proposalmakercontroller.repository;

import com.lic.epgs.proposal.proposalmakercontroller.model.GetCustomerCheckerResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetTrustDetailsRepository extends JpaRepository<GetCustomerCheckerResponse,Long> {
    
    GetCustomerCheckerResponse findByTrustId(Long trustId);
}