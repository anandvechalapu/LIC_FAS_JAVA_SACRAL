package com.lic.epgs.stampduty.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lic.epgs.stampduty.model.StampDuty;

public interface InProgressSearchFiltersService {

    Page<StampDuty> findByChallanGrnNo(String challanGrnNo, Pageable pageable);

    Page<StampDuty> findByChallanGrnDate(String challanGrnDate, Pageable pageable);

    Page<StampDuty> findByModifiedDateBetween(String fromDate, String toDate, Pageable pageable);

    Page<StampDuty> findByRoleTypeAndStampDutyStatus(String roleType, String stampDutyStatus, Pageable pageable);

    Page<StampDuty> findByStampDutyStatus(String stampDutyStatus, Pageable pageable);

    Page<StampDuty> findByUnitOfficeCode(String unitOfficeCode, Pageable pageable);

}