package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustData;
import com.lic.epgs.trust.repository.TrustManagementRepository;

@Service
public class TrustManagementService {
	
	@Autowired
	TrustManagementRepository trustManagementRepository;
	
	public TrustData findByInactiveStatus(Boolean inactiveStatus) {
		return trustManagementRepository.findByInactiveStatus(inactiveStatus);
	}
	
	public TrustData findByPendingForModification(Boolean pendingForModification) {
		return trustManagementRepository.findByPendingForModification(pendingForModification);
	}
	
	public TrustData findByBankAccountDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails(String bankAccountDetails, String contactDetails, String addressDetails, String documentDetails) {
		return trustManagementRepository.findByBankAccountDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails(bankAccountDetails, contactDetails, addressDetails, documentDetails);
	}
	
	public TrustData findByModifiedByUserAndModifiedOnDate(String modifiedByUser, String modifiedOnDate) {
		return trustManagementRepository.findByModifiedByUserAndModifiedOnDate(modifiedByUser, modifiedOnDate);
	}
	
	public void sendTrustDataToMaker(TrustData trustData) {
		trustManagementRepository.save(trustData);
	}
	
	public List<TrustData> getAllTrustData() {
		return trustManagementRepository.findAll();
	}
	
	public String getSuccessMessage() {
		return trustManagementRepository.getSuccessMessage();
	}
	
}