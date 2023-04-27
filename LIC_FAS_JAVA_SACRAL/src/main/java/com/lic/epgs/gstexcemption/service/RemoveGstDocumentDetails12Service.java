package com.lic.epgs.gstexcemption.service;

import com.lic.epgs.gstexcemption.repository.RemoveGstDocumentDetails12Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveGstDocumentDetails12Service {

    @Autowired
    private RemoveGstDocumentDetails12Repository removeGstDocumentDetails12Repository;

    public boolean checkExemptionIdExists(String gstExemptionId) {
        return removeGstDocumentDetails12Repository.existsByGstExemptionId(gstExemptionId);
    }

    public boolean checkDocumentIdExists(String documentId) {
        return removeGstDocumentDetails12Repository.existsByDocumentId(documentId);
    }

    public void deleteByGstExemptionIdAndDocumentId(String gstExemptionId, String documentId) {
        removeGstDocumentDetails12Repository.deleteByGstExemptionIdAndDocumentId(gstExemptionId, documentId);
    }
}