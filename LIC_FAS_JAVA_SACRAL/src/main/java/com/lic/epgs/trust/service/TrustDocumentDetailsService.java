package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustDocumentDetails;
import com.lic.epgs.trust.repository.TrustDocumentDetailsRepository;

@Service
public class TrustDocumentDetailsService {
	
	@Autowired
	TrustDocumentDetailsRepository trustDocumentDetailsRepository;
	
	public List<TrustDocumentDetails> findByTrustId(Long trustId) {
		return trustDocumentDetailsRepository.findByTrustId(trustId);
	}
	
	public TrustDocumentDetails saveTrustDocumentDetails(TrustDocumentDetails trustDocumentDetails) {
		return trustDocumentDetailsRepository.save(trustDocumentDetails);
	}
	
	public void deleteTrustDocumentDetails(Long documentId) {
		trustDocumentDetailsRepository.deleteById(documentId);
	}

}