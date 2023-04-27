package com.lic.epgs.stampduty.controller;

import com.lic.epgs.stampduty.dto.CommonResponseStampDto;
import com.lic.epgs.stampduty.service.StampDutyOverAllDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StampDutyOverallDetailsController {

    @Autowired
    private StampDutyOverAllDetailsService stampDutyOverAllDetailsService;

    @GetMapping("/stampduty/{stampId}")
    public CommonResponseStampDto getStampDutyOverallDetails(@PathVariable Long stampId){
        return stampDutyOverAllDetailsService.getStampDutyOverallDetails_STAMP_DUTY_7(stampId);
    }
}