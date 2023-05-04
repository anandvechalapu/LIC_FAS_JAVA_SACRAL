package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustBasicDetails;
import com.lic.epgs.trust.repository.SaveTrustBasicDetailsRepository;

@Service
public class SaveTrustBasicDetailsService {

    @Autowired
    SaveTrustBasicDetailsRepository saveTrustBasicDetailsRepository;

    public TrustBasicDetails findByTrustCode(String trustCode) {
        return saveTrustBasicDetailsRepository.findByTrustCode(trustCode);
    }

    public void save(TrustBasicDetails trustBasicDetails) {
        saveTrustBasicDetailsRepository.save(trustBasicDetails);
    }

    public void setTrustStatusAndWorkflowStatusAsDraft(String trustCode, boolean isDraft) {
        saveTrustBasicDetailsRepository.setTrustStatusAndWorkflowStatusAsDraft(trustCode, isDraft);
    }

    public void setIsActiveFlagAsTrue(String trustCode, boolean isActive) {
        saveTrustBasicDetailsRepository.setIsActiveFlagAsTrue(trustCode, isActive);
    }

    public void handleExceptionsAndErrorsGracefully(String trustCode) {
        saveTrustBasicDetailsRepository.handleExceptionsAndErrorsGracefully(trustCode);
    }

}