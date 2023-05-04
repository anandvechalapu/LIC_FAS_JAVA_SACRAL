package com.lic.epgs.trust.service;

import com.lic.epgs.trust.dto.TrustDetailsDto;
import com.lic.epgs.trust.entity.BankAccountDetailsEntity;
import com.lic.epgs.trust.entity.BankAccountDetailsTempEntity;
import com.lic.epgs.trust.entity.ContactDetailsTempEntity;
import com.lic.epgs.trust.entity.TrustDetailsTempEntity;
import com.lic.epgs.trust.repository.TrustRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrustService {

    @Autowired
    private TrustRepository trustRepository;

    public TrustDetailsTempEntity findByTrustId(Long trustId) {
        return trustRepository.findByTrustId(trustId);
    }

    public List<BankAccountDetailsTempEntity> findByTrustIdAndIsActive(Long trustId, Boolean isActive) {
        return trustRepository.findByTrustIdAndIsActive(trustId, isActive);
    }

    public BankAccountDetailsEntity save(BankAccountDetailsEntity bankAccountDetailsEntity) {
        return trustRepository.save(bankAccountDetailsEntity);
    }

    public List<ContactDetailsTempEntity> findContactDetailsTempEntityByTrustIdAndIsActive(Long trustId, Boolean isActive) {
        return trustRepository.findContactDetailsTempEntityByTrustIdAndIsActive(trustId, isActive);
    }

    public TrustDetailsTempEntity save(TrustDetailsTempEntity trustDetailsTempEntity) {
        return trustRepository.save(trustDetailsTempEntity);
    }

    public TrustDetailsTempEntity saveTrustDetails(TrustDetailsDto trustDetailsDto, String role) {
        return trustRepository.saveTrustDetails(trustDetailsDto, role);
    }

}