package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustDocumentDetails;
import com.lic.epgs.trust.repository.TrustDocumentDetailsRepository;

@Service
public class TrustDocumentDetailsService {
	
	@Autowired
	private TrustDocumentDetailsRepository trustDocumentDetailsRepository;
	
	//method to add document details to a trust
	public TrustDocumentDetails addDocumentDetailsToTrust(TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsRepository.addDocumentDetailsToTrust(trustDocumentDetails);
	}
	
	//method to update or remove document details associated with a trust
	public TrustDocumentDetails updateOrRemoveDocumentDetails(TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsRepository.updateOrRemoveDocumentDetails(trustDocumentDetails);
	}
	
	//method to provide a response to the user indicating the success or failure of the request to add, update or remove document details
	public TrustDocumentDetails getResponseForDocumentDetailsRequest(TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsRepository.getResponseForDocumentDetailsRequest(trustDocumentDetails);
	}
	
	//method to log all requests to add, update or remove document details
	public TrustDocumentDetails logDocumentDetailsRequest(TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsRepository.logDocumentDetailsRequest(trustDocumentDetails);
	}
	
}