// TrustRepository.java

package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.trust.model.TrustDetails;

public interface TrustRepository extends JpaRepository<TrustDetails, Long> {
    
    // Method to retrieve trust details in the temporary table
    TrustDetails findByTrustId(Long trustId);
    
    // Method to retrieve bank account details in the temporary table associated with the trustId
    TrustDetails findByTrustIdAndBankAccountId(Long trustId, Long bankAccountId);
    
    // Method to retrieve contact details in the temporary table associated with the trustId
    TrustDetails findByTrustIdAndContactPersonId(Long trustId, Long contactPersonId);
    
    // Method to retrieve address details in the temporary table associated with the trustId
    TrustDetails findByTrustIdAndAddressId(Long trustId, Long addressId);
    
    // Method to save the newly created trust details entity in the temporary table
    TrustDetails save(TrustDetails trustDetails);
    
    // Method to update the trust details entity in the temporary table
    TrustDetails updateTrustDetails(Long trustId, String role);
}