package com.lic.epgs.trust.service;

import com.lic.epgs.trust.dto.CommonTrustDto;
import com.lic.epgs.trust.repository.TrustManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrustManagementService {

    @Autowired
    private TrustManagementRepository trustManagementRepository;

    public CommonTrustDto getTrustById(Long trustId) {
        return trustManagementRepository.findByTrustId(trustId);
    }

    public void saveTrust(CommonTrustDto trustDto) {
        trustManagementRepository.save(trustDto);
    }
}