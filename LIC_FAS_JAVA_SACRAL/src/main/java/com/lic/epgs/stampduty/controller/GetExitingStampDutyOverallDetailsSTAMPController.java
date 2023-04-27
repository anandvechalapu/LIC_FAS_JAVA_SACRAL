);
    }
    
    public List<StampDutyNote> getStampDutyNote(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getStampDutyNote(stampId);
    }
    
    public String getNoteContent(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getNoteContent(stampId);
    }
    
    public String getCreatedBy(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getCreatedBy(stampId);
    }
    
    public String getModifiedBy(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getModifiedBy(stampId);
    }
    
    public Date getCreatedOn(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getCreatedOn(stampId);
    }
    
    public Date getModifiedOn(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getModifiedOn(stampId);
    }
    
    public Boolean getActiveStatus(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getActiveStatus(stampId);
    }

}

package com.lic.epgs.stampduty.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.entity.StampDutyConsumerUnit;
import com.lic.epgs.stampduty.entity.StampDutyEntity;
import com.lic.epgs.stampduty.entity.StampDutyNote;
import com.lic.epgs.stampduty.service.GetExitingStampDutyOverallDetailsSTAMPService;

@RestController
public class GetExitingStampDutyOverallDetailsSTAMPController {
    
    @Autowired
    GetExitingStampDutyOverallDetailsSTAMPService getExitingStampDutyOverallDetailsSTAMPService;
    
    @GetMapping("/stampduty/{stampId}")
    public StampDutyEntity getStampDutyEntity(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getStampDutyEntity(stampId);
    }
    
    @GetMapping("/stampdutyconsumerunit/{stampId}")
    public List<StampDutyConsumerUnit> getStampDutyConsumerUnit(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getStampDutyConsumerUnit(stampId);
    }
    
    @GetMapping("/stampdutynote/{stampId}")
    public List<StampDutyNote> getStampDutyNote(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getStampDutyNote(stampId);
    }
    
    @GetMapping("/notecontent/{stampId}")
    public String getNoteContent(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getNoteContent(stampId);
    }
    
    @GetMapping("/createdby/{stampId}")
    public String getCreatedBy(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getCreatedBy(stampId);
    }
    
    @GetMapping("/modifiedby/{stampId}")
    public String getModifiedBy(@PathVariable Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPService.getModifiedBy(stampId);
   