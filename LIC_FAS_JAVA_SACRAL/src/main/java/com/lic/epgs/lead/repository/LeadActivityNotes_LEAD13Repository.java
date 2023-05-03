package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.model.LeadActivityNotes;
import com.lic.epgs.lead.model.LeadNotesActiveTemp;

import java.util.List;

@Repository
public interface LeadActivityNotes_LEAD13Repository extends JpaRepository<LeadActivityNotes, Long> {

    @Modifying
    @Query("update LeadActivityNotes u set u.active = false where u.leadId = :leadId")
    int setLeadActivityNotesInactive(@Param("leadId") long leadId);
    
    @Modifying
    @Query("insert into LeadActivityNotes(leadId, activeBy, activeDate, activityType, activityNoteContent, createdBy, notesContent, createdOn) values (:leadId, :activeBy, :activeDate, :activityType, :activityNoteContent, :createdBy, :notesContent, :createdOn)")
    int saveLeadActivityNotes(@Param("leadId") long leadId, @Param("activeBy") String activeBy, @Param("activeDate") String activeDate, @Param("activityType") String activityType,
            @Param("activityNoteContent") String activityNoteContent, @Param("createdBy") String createdBy, @Param("notesContent") String notesContent, 
            @Param("createdOn") String createdOn);

    @Query("select u from LeadActivityNotes u where u.leadId = :leadId")
    List<LeadNotesActiveTemp> getLeadActivityNotes(@Param("leadId") long leadId);

}