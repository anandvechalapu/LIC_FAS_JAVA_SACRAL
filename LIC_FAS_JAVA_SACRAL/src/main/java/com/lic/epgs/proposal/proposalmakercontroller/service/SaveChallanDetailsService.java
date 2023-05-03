package com.lic.epgs.proposal.proposalmakercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.proposal.proposalmakercontroller.entity.ChallanDetails;
import com.lic.epgs.proposal.proposalmakercontroller.repository.SaveChallanDetailsRepository;

@Service
public class SaveChallanDetailsService {
	
	@Autowired
	private SaveChallanDetailsRepository saveChallanDetailsRepository;
	
	public ChallanDetails findByActiveTrueAndCreatedBy(String createdBy) {
		return saveChallanDetailsRepository.findByActiveTrueAndCreatedBy(createdBy);
	}
	
	public void deleteByActiveTrueAndCreatedBy(String createdBy) {
		saveChallanDetailsRepository.deleteByActiveTrueAndCreatedBy(createdBy);
	}
	
	public ChallanDetails save(ChallanDetails challanDetails) {
		return saveChallanDetailsRepository.save(challanDetails);
	}

}