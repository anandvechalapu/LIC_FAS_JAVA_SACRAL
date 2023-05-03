package com.lic.epgs.lead.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.lead.entity.InProgressSearch_LEAD;

@Repository
public interface InProgressSearch_LEADRepository extends JpaRepository<InProgressSearch_LEAD, Long> {
    
    @Query("SELECT l FROM InProgressSearch_LEAD l WHERE l.unitCode = :unitCode AND l.user = :user ORDER BY l.leadId DESC")
    public InProgressSearch_LEAD findByUnitCodeAndUser(@Param("unitCode") String unitCode, @Param("user") String user);
    
    @Query("SELECT l.leadId, l.name, l.unitCode, l.status, l.number, l.subStatus, l.channelData FROM InProgressSearch_LEAD l WHERE l.unitCode = :unitCode AND l.user = :user ORDER BY l.leadId DESC")
    public InProgressSearch_LEAD getLeadDataByUnitCodeAndUser(@Param("unitCode") String unitCode, @Param("user") String user);
}