package com.lic.epgs.stampduty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.StampDuty;
import com.lic.epgs.stampduty.service.InProgressSearchFiltersService;

@RestController
@RequestMapping("/in-progress")
public class InProgressSearchFiltersController {

    @Autowired
    private InProgressSearchFiltersService inProgressSearchFiltersService;

    @GetMapping
    public Page<StampDuty> getInProgressSearchFilters(@RequestParam String challanGrnNo, @RequestParam String challanGrnDate,
            @RequestParam String fromDate, @RequestParam String toDate, @RequestParam String roleType,
            @RequestParam String stampDutyStatus, @RequestParam String unitOfficeCode, Pageable pageable) {
        return inProgressSearchFiltersService.findByChallanGrnNo(challanGrnNo, pageable)
                .or(inProgressSearchFiltersService.findByChallanGrnDate(challanGrnDate, pageable))
                .or(inProgressSearchFiltersService.findByModifiedDateBetween(fromDate, toDate, pageable))
                .or(inProgressSearchFiltersService.findByRoleTypeAndStampDutyStatus(roleType, stampDutyStatus, pageable))
                .or(inProgressSearchFiltersService.findByStampDutyStatus(stampDutyStatus, pageable))
                .or(inProgressSearchFiltersService.findByUnitOfficeCode(unitOfficeCode, pageable)).get();
    }

}