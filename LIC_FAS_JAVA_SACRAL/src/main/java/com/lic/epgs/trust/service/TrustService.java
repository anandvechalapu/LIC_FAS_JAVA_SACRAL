// TrustService.java

package com.lic.epgs.trust.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.repository.TrustRepository;

@Service
public class TrustService {
    
    @Autowired
    private TrustRepository trustRepository;
    
    // Method to retrieve trust details in the temporary table
    public TrustDetails findByTrustId(Long trustId) {
        return trustRepository.findByTrustId(trustId);
    }
    
    // Method to retrieve bank account details in the temporary table associated with the trustId
    public TrustDetails findByTrustIdAndBankAccountId(Long trustId, Long bankAccountId) {
        return trustRepository.findByTrustIdAndBankAccountId(trustId, bankAccountId);
    }
    
    // Method to retrieve contact details in the temporary table associated with the trustId
    public TrustDetails findByTrustIdAndContactPersonId(Long trustId, Long contactPersonId) {
        return trustRepository.findByTrustIdAndContactPersonId(trustId, contactPersonId);
    }
    
    // Method to retrieve address details in the temporary table associated with the trustId
    public TrustDetails findByTrustIdAndAddressId(Long trustId, Long addressId) {
        return trustRepository.findByTrustIdAndAddressId(trustId, addressId);
    }
    
    // Method to save the newly created trust details entity in the temporary table
    public TrustDetails save(TrustDetails trustDetails) {
        return trustRepository.save(trustDetails);
    }
    
    // Method to update the trust details entity in the temporary table
    public TrustDetails updateTrustDetails(Long trustId, String role) {
        TrustDetails trustDetails = trustRepository.findByTrustId(trustId);
        trustDetails.setRole(role);
        return trustRepository.save(trustDetails);
    }
}