package com.lic.epgs.trust.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.trust.model.TrustDetails;
import com.lic.epgs.trust.repository.RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository;

@Service
public class RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service {
 
    private final RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository;
    
    public RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Service(RemoveTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository) {
        this.removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository = removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository;
    }
    
    public int removeTrustContactPersonDetails(String trustId, String contactPersonId, String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.removeTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    public Optional<TrustDetails> findTrustContactPersonDetails(String trustId, String contactPersonId, String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.findTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    public int updateTrustContactPersonDetails(String trustId, String contactPersonId, String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.updateTrustContactPersonDetails(trustId, contactPersonId, role);
    }
    
    public List<TrustDetails> findTrustContactPersonsByTrustId(String trustId) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.findTrustContactPersonsByTrustId(trustId);
    }
    
    public List<TrustDetails> findTrustContactPersonsByTrustIdAndRole(String trustId, String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.findTrustContactPersonsByTrustIdAndRole(trustId, role);
    }
    
    public List<TrustDetails> findTrustContactPersonsByContactPersonId(String contactPersonId) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.findTrustContactPersonsByContactPersonId(contactPersonId);
    }
    
    public List<TrustDetails> findTrustContactPersonsByContactPersonIdAndRole(String contactPersonId, String role) {
        return removeTrustContactPersonDetailsTRUSTMANAGEMENTCONTROLLER23Repository.findTrustContactPersonsByContactPersonIdAndRole(contactPersonId, role);
    }
}