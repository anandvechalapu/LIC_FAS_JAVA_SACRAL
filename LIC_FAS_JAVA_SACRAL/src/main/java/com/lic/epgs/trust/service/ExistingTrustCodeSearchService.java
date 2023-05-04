package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.repository.ExistingTrustCodeSearchRepository;
import com.lic.epgs.trust.dto.CommonTrustDto;

@Service
public class ExistingTrustCodeSearchService {

	@Autowired
	private ExistingTrustCodeSearchRepository existingTrustCodeSearchRepository;
	
	public List<CommonTrustDto> findByTrustCodeAndUnitCode(String trustCode, String unitCode) {
		return existingTrustCodeSearchRepository.findByTrustCodeAndUnitCode(trustCode, unitCode);
	}
	
	public List<CommonTrustDto> findByStatusInAndTrustCodeAndUnitCode(List<String> status, String trustCode, String unitCode) {
		return existingTrustCodeSearchRepository.findByStatusInAndTrustCodeAndUnitCode(status, trustCode, unitCode);
	}
	
	public List<CommonTrustDto> findByTransactionMessage(String transactionMessage) {
		return existingTrustCodeSearchRepository.findByTransactionMessage(transactionMessage);
	}
	
}