package com.lic.epgs.stampduty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.entity.StampDuty;
import com.lic.epgs.stampduty.service.StampDutyService;

@RestController
public class StampDutyController {

    @Autowired
    StampDutyService stampDutyService;

    @GetMapping(value = "/stampduty")
    public List<StampDuty> getStampDutyRecords(@RequestParam(value = "roleType") String roleType,
            @RequestParam(value = "unitOfficeCode") String unitOfficeCode,
            @RequestParam(value = "challanGRNNumber") String challanGRNNumber,
            @RequestParam(value = "challanGRNDate") String challanGRNDate,
            @RequestParam(value = "stampDutyStatus") String stampDutyStatus,
            @RequestParam(value = "startDate") String startDate,
            @RequestParam(value = "endDate") String endDate) {
        return stampDutyService.findByFilters(roleType, unitOfficeCode, challanGRNNumber, challanGRNDate, stampDutyStatus, startDate, endDate);
    }

}