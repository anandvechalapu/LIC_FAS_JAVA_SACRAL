package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.repository.SendForApprovalTrustRepository;

@Service
public class SendForApprovalTrustService {
	
	@Autowired
	SendForApprovalTrustRepository trustRepository;
	
	public Trust findByTrustId(Long trustId){
		return trustRepository.findByTrustId(trustId);
	}
	
	public Trust save(Trust trust){
		return trustRepository.save(trust);
	}
	
	public void removeByTrustId(Long trustId){
		trustRepository.removeByTrustId(trustId);
	}
	
	public void updateTrustStatus(Long trustId, String status){
		trustRepository.updateTrustStatus(trustId, status);
	}
	
	public void sendTrustToApprover(Long trustId){
		trustRepository.sendTrustToApprover(trustId);
	}
	
	public void saveTrustDetails(Long trustId, String bankAccountDetails, String contactDetails, String addressDetails, String trustNotes){
		trustRepository.saveTrustDetails(trustId, bankAccountDetails, contactDetails, addressDetails, trustNotes);
	}
	
}