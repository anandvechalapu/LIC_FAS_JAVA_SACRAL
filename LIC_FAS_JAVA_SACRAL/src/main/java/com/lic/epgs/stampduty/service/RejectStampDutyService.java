package com.lic.epgs.stampduty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.stampduty.model.RejectStampDuty;
import com.lic.epgs.stampduty.repository.RejectStampDutyRepository;

@Service
public class RejectStampDutyService {

    @Autowired
    private RejectStampDutyRepository rejectStampDutyRepository;

    public RejectStampDuty save(RejectStampDuty rejectStampDuty) {
        return rejectStampDutyRepository.save(rejectStampDuty);
    }

    public void delete(RejectStampDuty rejectStampDuty) {
        rejectStampDutyRepository.delete(rejectStampDuty);
    }

    public RejectStampDuty findByRejectionReasonCode(String rejectionReasonCode) {
        return rejectStampDutyRepository.findByRejectionReasonCode(rejectionReasonCode);
    }

    public RejectStampDuty findByRejectionRemarks(String rejectionRemarks) {
        return rejectStampDutyRepository.findByRejectionRemarks(rejectionRemarks);
    }

    public List<RejectStampDuty> getAllRejectStampDuty() {
        return rejectStampDutyRepository.findAll();
    }
}