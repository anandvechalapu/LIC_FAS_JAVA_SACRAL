package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.model.Lead;

@Repository
public interface ActivateLead_LeadRepository extends JpaRepository<Lead, Long> {
 
    Lead findByLeadId(Long leadId);
 
    Lead save(Lead lead);
 
    Lead updateLeadById(Long leadId, String modifiedBy, String leadStatus);
 
    String getTransactionStatusAndMessage(Long leadId);
}