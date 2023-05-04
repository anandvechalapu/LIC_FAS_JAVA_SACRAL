package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.repository.GetInProgressTrustDetailsRepository;

@Service
public class GetInProgressTrustDetailsService {

	@Autowired
	private GetInProgressTrustDetailsRepository repository;

	public TrustDetails getTrustDetailsByTrustIdAndUnitCode(String trustId, String unitCode) {
		return repository.getTrustDetailsByTrustIdAndUnitCode(trustId, unitCode);
	}

}