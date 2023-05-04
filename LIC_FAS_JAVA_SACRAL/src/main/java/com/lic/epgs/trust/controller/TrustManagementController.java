package com.lic.epgs.trust.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.model.Trust;
import com.lic.epgs.trust.service.RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service;

@RestController
@RequestMapping("/trust")
public class TrustManagementController {

    private RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service;

    public TrustManagementController(RemoveTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service) {
        this.removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service = removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service;
    }

    @PostMapping("/trust/add")
    public Trust createTrust(@RequestBody Trust trust) {
        return trust;
    }

    @PutMapping("/trust/edit")
    public Trust updateTrust(@RequestBody Trust trust) {
        return trust;
    }

    @DeleteMapping("/trust/remove/{trustId}/{documentId}/{role}")
    public void removeTrustDocument(@PathVariable Long trustId, @PathVariable Long documentId, @PathVariable String role) {
        removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service.removeTrustDocument(trustId, documentId, role);
    }

    @GetMapping("/trust/check/{trustId}/{documentId}/{role}")
    public int checkIfTrustDocumentExists(@PathVariable Long trustId, @PathVariable Long documentId, @PathVariable String role) {
        return removeTrustDocumentTRUSTMANAGEMENTCONTROLLER24Service.checkIfTrustDocumentExists(trustId, documentId, role);
    }
}