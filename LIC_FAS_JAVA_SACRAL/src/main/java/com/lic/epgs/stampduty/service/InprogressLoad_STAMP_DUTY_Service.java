package com.lic.epgs.stampduty.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.model.InprogressLoad_STAMP_DUTY;
import com.lic.epgs.stampduty.repository.InprogressLoad_STAMP_DUTY_Repository;

@Service
public class InprogressLoad_STAMP_DUTY_Service {

    @Autowired
    private InprogressLoad_STAMP_DUTY_Repository inprogressLoad_STAMP_DUTY_Repository;

    public Optional<InprogressLoad_STAMP_DUTY> getInprogressLoad_STAMP_DUTY(String role, String unitOfficeCode) {
        return inprogressLoad_STAMP_DUTY_Repository.getInprogressLoad_STAMP_DUTY(role, unitOfficeCode);
    }

}