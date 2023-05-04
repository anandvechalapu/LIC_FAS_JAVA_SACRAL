package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.model.TrustAddressDetails;
import com.lic.epgs.trust.repository.RemoveTrustAddressDetailsRepository;

@Service
public class RemoveTrustAddressDetailsService {

    @Autowired
    private RemoveTrustAddressDetailsRepository removeTrustAddressDetailsRepository;

    /**
     * setInactiveByTrustIdAndAddressIdAndRole
     * @param trustId
     * @param addressId
     * @param role
     * @param modifiedBy
     * @param modifiedOn
     * @return
     */
    public int setInactiveByTrustIdAndAddressIdAndRole(Long trustId, Long addressId, 
    String role, String modifiedBy, String modifiedOn) {
        return removeTrustAddressDetailsRepository.setInactiveByTrustIdAndAddressIdAndRole(trustId, addressId, role, modifiedBy, modifiedOn);
    }

}