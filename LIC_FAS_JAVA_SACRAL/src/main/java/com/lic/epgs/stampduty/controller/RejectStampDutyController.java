package com.lic.epgs.stampduty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.stampduty.model.RejectStampDuty;
import com.lic.epgs.stampduty.service.RejectStampDutyService;

@RestController
public class RejectStampDutyController {

    @Autowired
    private RejectStampDutyService rejectStampDutyService;

    @PostMapping("/rejectStampDuty")
    public RejectStampDuty save(@RequestBody RejectStampDuty rejectStampDuty) {
        return rejectStampDutyService.save(rejectStampDuty);
    }

    @DeleteMapping("/rejectStampDuty/{id}")
    public void delete(@PathVariable Long id) {
        rejectStampDutyService.delete(rejectStampDutyService.findByRejectionReasonCode(id.toString()));
    }

    @GetMapping("/rejectStampDuty/{id}")
    public RejectStampDuty findByRejectionReasonCode(@PathVariable String id) {
        return rejectStampDutyService.findByRejectionReasonCode(id);
    }

    @GetMapping("/rejectStampDuty")
    public List<RejectStampDuty> getAllRejectStampDuty() {
        return rejectStampDutyService.getAllRejectStampDuty();
    }

}