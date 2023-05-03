package com.lic.epgs.proposal.proposalmakercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDTO;

@Repository
public interface TrustDetailsRepository extends JpaRepository<CommonResponseDTO, Long> {
	
	public CommonResponseDTO findTrustNameListByCustomerId(Long customerId);

}