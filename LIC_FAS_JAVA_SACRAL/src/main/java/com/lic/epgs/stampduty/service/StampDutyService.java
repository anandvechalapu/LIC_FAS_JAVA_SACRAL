package com.lic.epgs.stampduty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.entity.StampDuty;
import com.lic.epgs.stampduty.repository.StampDutyRepository;

@Service
public class StampDutyService {

    @Autowired
    StampDutyRepository stampDutyRepository;

    public List<StampDuty> findByFilters(String roleType, String unitOfficeCode, String challanGRNNumber, String challanGRNDate, String stampDutyStatus, String startDate, String endDate) {
        return stampDutyRepository.findByFilters(roleType, unitOfficeCode, challanGRNNumber, challanGRNDate, stampDutyStatus, startDate, endDate);
    }

}