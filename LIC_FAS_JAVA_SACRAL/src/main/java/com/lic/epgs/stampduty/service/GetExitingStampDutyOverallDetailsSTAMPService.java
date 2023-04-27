package com.lic.epgs.stampduty.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.stampduty.entity.StampDutyConsumerUnit;
import com.lic.epgs.stampduty.entity.StampDutyEntity;
import com.lic.epgs.stampduty.entity.StampDutyNote;

public interface GetExitingStampDutyOverallDetailsSTAMPRepository extends JpaRepository<StampDutyEntity, Long> {
    
    // get Stamp Duty Entity
    @Query("select s from StampDutyEntity s where s.id = :stampId")
    StampDutyEntity getStampDutyEntity(@Param("stampId") Long stampId);
    
    // get list of Stamp Duty Consumer Units
    @Query("select scu from StampDutyEntity scu where scu.id = :stampId")
    List<StampDutyConsumerUnit> getStampDutyConsumerUnit(@Param("stampId") Long stampId);
    
    // get list of Stamp Duty Notes
    @Query("select sn from StampDutyEntity sn where sn.id = :stampId")
    List<StampDutyNote> getStampDutyNote(@Param("stampId") Long stampId);
    
    // get note content
    @Query("select sn.noteContent from StampDutyEntity sn where sn.id = :stampId")
    String getNoteContent(@Param("stampId") Long stampId);
    
    // get created by
    @Query("select sn.createdBy from StampDutyEntity sn where sn.id = :stampId")
    String getCreatedBy(@Param("stampId") Long stampId);
    
    // get modified by
    @Query("select sn.modifiedBy from StampDutyEntity sn where sn.id = :stampId")
    String getModifiedBy(@Param("stampId") Long stampId);
    
    // get created on
    @Query("select sn.createdOn from StampDutyEntity sn where sn.id = :stampId")
    Date getCreatedOn(@Param("stampId") Long stampId);
    
    // get modified on
    @Query("select sn.modifiedOn from StampDutyEntity sn where sn.id = :stampId")
    Date getModifiedOn(@Param("stampId") Long stampId);
    
    // get active status
    @Query("select sn.active from StampDutyEntity sn where sn.id = :stampId")
    Boolean getActiveStatus(@Param("stampId") Long stampId);
    
}

package com.lic.epgs.stampduty.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.entity.StampDutyConsumerUnit;
import com.lic.epgs.stampduty.entity.StampDutyEntity;
import com.lic.epgs.stampduty.entity.StampDutyNote;
import com.lic.epgs.stampduty.repository.GetExitingStampDutyOverallDetailsSTAMPRepository;

@Service
public class GetExitingStampDutyOverallDetailsSTAMPService {
    
    @Autowired
    GetExitingStampDutyOverallDetailsSTAMPRepository getExitingStampDutyOverallDetailsSTAMPRepository;
    
    public StampDutyEntity getStampDutyEntity(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getStampDutyEntity(stampId);
    }
    
    public List<StampDutyConsumerUnit> getStampDutyConsumerUnit(Long stampId) {
        return getExitingStampDutyOverallDetailsSTAMPRepository.getStampDutyConsumerUnit(stampId