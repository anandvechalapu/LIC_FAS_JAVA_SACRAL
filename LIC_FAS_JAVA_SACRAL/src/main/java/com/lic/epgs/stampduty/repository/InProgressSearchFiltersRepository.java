package com.lic.epgs.stampduty.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.stampduty.model.StampDuty;

@Repository
public interface InProgressSearchFiltersRepository extends JpaRepository<StampDuty, Long> {

    @Query("SELECT s FROM StampDuty s WHERE s.challanGrnNo = :challanGrnNo  AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByChallanGrnNo(@Param("challanGrnNo") String challanGrnNo, Pageable pageable);

    @Query("SELECT s FROM StampDuty s WHERE s.challanGrnDate = :challanGrnDate  AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByChallanGrnDate(@Param("challanGrnDate") String challanGrnDate, Pageable pageable);

    @Query("SELECT s FROM StampDuty s WHERE s.modifiedDate >= :fromDate AND s.modifiedDate <= :toDate AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByModifiedDateBetween(@Param("fromDate") String fromDate, @Param("toDate") String toDate, Pageable pageable);

    @Query("SELECT s FROM StampDuty s WHERE s.roleType = :roleType AND (s.stampDutyStatus = :stampDutyStatus OR s.stampDutyStatus IS NULL) AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByRoleTypeAndStampDutyStatus(@Param("roleType") String roleType, @Param("stampDutyStatus") String stampDutyStatus, Pageable pageable);

    @Query("SELECT s FROM StampDuty s WHERE s.stampDutyStatus = :stampDutyStatus AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByStampDutyStatus(@Param("stampDutyStatus") String stampDutyStatus, Pageable pageable);

    @Query("SELECT s FROM StampDuty s WHERE s.unitOfficeCode = :unitOfficeCode  AND s.active = true ORDER BY s.modifiedDate DESC")
    Page<StampDuty> findByUnitOfficeCode(@Param("unitOfficeCode") String unitOfficeCode, Pageable pageable);

}