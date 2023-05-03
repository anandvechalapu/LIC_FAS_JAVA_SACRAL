package com.lic.epgs.lead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.lead.model.LeadActivityNotes;
import com.lic.epgs.lead.model.LeadNotesActiveTemp;
import com.lic.epgs.lead.repository.LeadActivityNotes_LEAD13Repository;

@Service 
public class LeadActivityNotes_LEAD13Service {

    @Autowired
    LeadActivityNotes_LEAD13Repository leadActivityNotes_LEAD13Repository;

    public int setLeadActivityNotesInactive(long leadId) {
        return leadActivityNotes_LEAD13Repository.setLeadActivityNotesInactive(leadId);
    }

    public int saveLeadActivityNotes(long leadId, String activeBy, String activeDate, String activityType,
            String activityNoteContent, String createdBy, String notesContent, String createdOn) {
        return leadActivityNotes_LEAD13Repository.saveLeadActivityNotes(leadId, activeBy, activeDate, activityType,
                activityNoteContent, createdBy, notesContent, createdOn);
    }

    public List<LeadNotesActiveTemp> getLeadActivityNotes(long leadId) {
        return leadActivityNotes_LEAD13Repository.getLeadActivityNotes(leadId);
    }
}