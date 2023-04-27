package com.lic.epgs.gstexcemption.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoveGstDocumentDetails12Repository extends JpaRepository<RemoveGstDocumentDetails12, String> {
    
    // Method to check if a customer's GST exemption ID exists
    public boolean existsByGstExemptionId(String gstExemptionId);

    // Method to check if a document ID exists
    public boolean existsByDocumentId(String documentId);

    // Method to mark a document detail as inactive
    public void deleteByGstExemptionIdAndDocumentId(String gstExemptionId, String documentId);
}