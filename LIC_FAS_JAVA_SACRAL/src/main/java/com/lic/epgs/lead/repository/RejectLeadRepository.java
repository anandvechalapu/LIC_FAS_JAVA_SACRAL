package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RejectLeadRepository extends JpaRepository<RejectLead, Long> {
    
    RejectLead findByLeadId(Long leadId);

    void saveRejectLead(RejectLead rejectLead);

    void updateLeadBasicDetails(RejectLead rejectLead);

    void updateLeadProductDetails(RejectLead rejectLead);

    void updateLeadChannelDetails(RejectLead rejectLead);

    void updateLeadNotesEntities(RejectLead rejectLead);

}