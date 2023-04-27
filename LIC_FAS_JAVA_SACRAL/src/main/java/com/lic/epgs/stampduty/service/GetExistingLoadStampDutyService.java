package com.lic.epgs.stampduty.service;

import com.lic.epgs.stampduty.model.StampDuty;
import com.lic.epgs.stampduty.repository.GetExistingLoadStampDutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetExistingLoadStampDutyService {

    @Autowired
    private GetExistingLoadStampDutyRepository getExistingLoadStampDutyRepository;

    public Optional<StampDuty> findByRoleAndUnitOfficeCode(String role, String unitOfficeCode) {
        return getExistingLoadStampDutyRepository.findByRoleAndUnitOfficeCode(role, unitOfficeCode);
    }

}