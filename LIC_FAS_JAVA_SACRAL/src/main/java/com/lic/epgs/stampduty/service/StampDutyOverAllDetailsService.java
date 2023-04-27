package com.lic.epgs.stampduty.service;

import com.lic.epgs.stampduty.dto.CommonResponseStampDto;
import com.lic.epgs.stampduty.repository.StampDutyOverallDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StampDutyOverAllDetailsService {

    @Autowired
    private StampDutyOverallDetailsRepository stampDutyOverallDetailsRepository;

    public CommonResponseStampDto getStampDutyOverallDetails_STAMP_DUTY_7(Long stampId) {
        return stampDutyOverallDetailsRepository.getStampDutyOverallDetails_STAMP_DUTY_7(stampId);
    }
}