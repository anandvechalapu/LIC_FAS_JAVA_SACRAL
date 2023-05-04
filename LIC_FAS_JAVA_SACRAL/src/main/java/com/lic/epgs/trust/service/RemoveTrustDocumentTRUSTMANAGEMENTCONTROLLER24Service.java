package com.lic.epgs.trust.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.repository.RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository;

public class RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service {

    private RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository;

    public RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service(RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository) {
        this.removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository = removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository;
    }

    public void removeTrustDocument(long trustId, long documentId, String role) {
        removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository.removeTrustDocument(trustId, documentId, role);
    }

    public int checkIfTrustDocumentExists(long trustId, long documentId, String role) {
        return removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Repository.checkIfTrustDocumentExists(trustId, documentId, role);
    }
}