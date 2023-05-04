package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.repository.TrustRepository;

@Service
public class TrustService {
	
	@Autowired
	private TrustRepository trustRepository;
	
	public List<Trust> getExistingTrustDetails(String trustId, String unitCode) {
		return trustRepository.getExistingTrustDetails(trustId, unitCode);
	}

}