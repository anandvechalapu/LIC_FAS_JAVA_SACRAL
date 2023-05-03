package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.model.EditExistingLeadDetails_LEAD;

@Repository
public interface EditExistingLeadDetails_LEADRepository extends JpaRepository<EditExistingLeadDetails_LEAD, Long> {

    // Fetch existing lead details
    EditExistingLeadDetails_LEAD findByLeadId(long leadId);

    // Update existing lead details in the database
    EditExistingLeadDetails_LEAD save(EditExistingLeadDetails_LEAD lead);

    // Generate a lead ID for updated lead details
    Long generateLeadId();

    // Save updated lead's product details in the database
    EditExistingLeadDetails_LEAD saveProductDetails(EditExistingLeadDetails_LEAD lead);

    // Save updated lead's channel details in the database
    EditExistingLeadDetails_LEAD saveChannelDetails(EditExistingLeadDetails_LEAD lead);

    // Save updated lead's notes in the database
    EditExistingLeadDetails_LEAD saveNotes(EditExistingLeadDetails_LEAD lead);

    // Log any errors encountered during the process
    void logError(String message);

}