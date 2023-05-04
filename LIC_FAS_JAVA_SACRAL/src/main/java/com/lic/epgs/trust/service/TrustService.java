package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.repository.TrustRepository;

@Service
public class TrustService {

	@Autowired
	private TrustRepository trustRepository;

	public Trust saveAndSendForApproval(Trust trust) {
		return trustRepository.saveAndSendForApproval(trust);
	}

	public Trust updateAndSendForApproval(Trust trust) {
		return trustRepository.updateAndSendForApproval(trust);
	}

}