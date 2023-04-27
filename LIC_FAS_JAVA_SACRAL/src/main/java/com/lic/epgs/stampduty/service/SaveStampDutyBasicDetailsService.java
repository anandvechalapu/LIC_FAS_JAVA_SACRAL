package com.lic.epgs.stampduty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.entity.StampDutyTempEntity;
import com.lic.epgs.stampduty.repository.SaveStampDutyBasicDetailsRepository;

@Service
public class SaveStampDutyBasicDetailsService {

	@Autowired
	private SaveStampDutyBasicDetailsRepository saveStampDutyBasicDetailsRepository;

	public StampDutyTempEntity findByStampId(Long stampId) {
		return saveStampDutyBasicDetailsRepository.findByStampId(stampId);
	}

	public StampDutyTempEntity findByPolicyStampTypeId(Long policyStampTypeId) {
		return saveStampDutyBasicDetailsRepository.findByPolicyStampTypeId(policyStampTypeId);
	}

	public StampDutyTempEntity findByMstStampId(Long mstStampId) {
		return saveStampDutyBasicDetailsRepository.findByMstStampId(mstStampId);
	}

	public StampDutyTempEntity findByChallanGrnNo(String challanGrnNo) {
		return saveStampDutyBasicDetailsRepository.findByChallanGrnNo(challanGrnNo);
	}

	public StampDutyTempEntity findByCertificateQueryIdNo(String certificateQueryIdNo) {
		return saveStampDutyBasicDetailsRepository.findByCertificateQueryIdNo(certificateQueryIdNo);
	}

}