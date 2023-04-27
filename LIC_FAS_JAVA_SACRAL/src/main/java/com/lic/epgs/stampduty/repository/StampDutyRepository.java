package com.lic.epgs.stampduty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.entity.StampDuty;

import java.util.List;

@Repository
public interface StampDutyRepository extends JpaRepository<StampDuty, Long> {

    @Query("SELECT s FROM StampDuty s WHERE s.roleType = ?1 AND s.unitOfficeCode = ?2 AND s.challanGRNNumber = ?3 AND s.challanGRNDate = ?4 AND s.stampDutyStatus = ?5 AND s.createdDate BETWEEN ?6 AND ?7")
    List<StampDuty> findByFilters(String roleType, String unitOfficeCode, String challanGRNNumber, String challanGRNDate, String stampDutyStatus, String startDate, String endDate);

}