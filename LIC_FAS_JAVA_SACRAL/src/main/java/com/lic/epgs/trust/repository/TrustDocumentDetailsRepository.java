package com.lic.epgs.trust.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.trust.model.TrustDocumentDetails;

@Repository
public interface TrustDocumentDetailsRepository extends JpaRepository<TrustDocumentDetails, Long> {

    //method to add document details to a trust
    TrustDocumentDetails addDocumentDetailsToTrust(TrustDocumentDetails trustDocumentDetails);
    
    //method to update or remove document details associated with a trust
    TrustDocumentDetails updateOrRemoveDocumentDetails(TrustDocumentDetails trustDocumentDetails);
    
    //method to provide a response to the user indicating the success or failure of the request to add, update or remove document details
    TrustDocumentDetails getResponseForDocumentDetailsRequest(TrustDocumentDetails trustDocumentDetails);
    
    //method to log all requests to add, update or remove document details
    TrustDocumentDetails logDocumentDetailsRequest(TrustDocumentDetails trustDocumentDetails);
    
}