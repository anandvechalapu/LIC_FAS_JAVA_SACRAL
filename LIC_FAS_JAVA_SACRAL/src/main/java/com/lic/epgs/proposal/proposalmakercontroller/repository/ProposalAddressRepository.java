package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.proposal.proposalmakercontroller.model.ProposalAddress;

public interface ProposalAddressRepository extends JpaRepository<ProposalAddress, Long> {
 
    ProposalAddress findByProposalIdAndAddressId(Long proposalId, Long addressId);
    
}