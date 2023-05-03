package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.dto.CommonResponseDTO;
import com.lic.epgs.proposal.proposalmakercontroller.repository.TrustDetailsRepository;

@Service
public class TrustDetailsService {

	@Autowired
	private TrustDetailsRepository trustDetailsRepository;
	
	public CommonResponseDTO getTrustNameListByCustomerId(Long customerId){
		return trustDetailsRepository.findTrustNameListByCustomerId(customerId);
	}
}