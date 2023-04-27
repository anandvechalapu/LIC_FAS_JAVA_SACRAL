package com.lic.epgs.stampduty.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.InprogressLoad_STAMP_DUTY;
import com.lic.epgs.stampduty.service.InprogressLoad_STAMP_DUTY_Service;

@RestController
@RequestMapping("/api/inprogressLoad_Stamp_Duty")
public class InprogressLoad_STAMP_DUTY_Controller {

    @Autowired
    private InprogressLoad_STAMP_DUTY_Service inprogressLoad_STAMP_DUTY_Service;

    @GetMapping("/get")
    public Optional<InprogressLoad_STAMP_DUTY> getInprogressLoad_STAMP_DUTY(String role, String unitOfficeCode) {
        return inprogressLoad_STAMP_DUTY_Service.getInprogressLoad_STAMP_DUTY(role, unitOfficeCode);
    }

}