package com.lic.epgs.trust.repository; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustData;

@Repository
public interface TrustManagementRepository extends JpaRepository<TrustData, Long> {
 
    TrustData findByInactiveStatus(Boolean inactiveStatus);
    TrustData findByPendingForModification(Boolean pendingForModification);
    TrustData findByBankAccountDetailsAndContactDetailsAndAddressDetailsAndDocumentDetails(String bankAccountDetails, String contactDetails, String addressDetails, String documentDetails);
    TrustData findByModifiedByUserAndModifiedOnDate(String modifiedByUser, String modifiedOnDate);
    void sendTrustDataToMaker(TrustData trustData);
    String getSuccessMessage();
 
}