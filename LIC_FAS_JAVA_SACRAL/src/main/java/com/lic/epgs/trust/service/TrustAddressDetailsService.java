package com.lic.epgs.trust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.trust.entity.TrustAddressDetails;
import com.lic.epgs.trust.repository.TrustAddressDetailsRepository;

@Service
public class TrustAddressDetailsService {

    @Autowired
    TrustAddressDetailsRepository trustAddressDetailsRepository;

    public TrustAddressDetails saveAddressDetails(TrustAddressDetails addressDetails) {
        return trustAddressDetailsRepository.save(addressDetails);
    }

    public void updateAddressDetails(Long addressId, String modifiedBy, String createdBy, Long trustId, String addressLine1, String addressLine2, String city, String state, String zipCode, Boolean isActive) {
        trustAddressDetailsRepository.updateAddressDetails(addressId, modifiedBy, createdBy, trustId, addressLine1, addressLine2, city, state, zipCode, isActive);
    }

    public List<TrustAddressDetails> getAddressDetailsByTrustId(Long trustId) {
        return trustAddressDetailsRepository.findByTrustId(trustId);
    }

    public void deleteAddressDetails(Long addressId) {
        trustAddressDetailsRepository.deleteById(addressId);
    }
}