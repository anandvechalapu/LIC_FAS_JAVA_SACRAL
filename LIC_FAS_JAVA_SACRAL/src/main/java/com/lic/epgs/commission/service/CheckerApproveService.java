package com.lic.epgs.commission.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.entity.CommissionEntity;
import com.lic.epgs.commission.entity.CommissionTempEntity;
import com.lic.epgs.commission.repository.CheckerApproveRepository;

@Service
public class CheckerApproveService {
    
    @Autowired
    private CheckerApproveRepository checkerApproveRepository;
    
    public int updateCommissionStatus(String commissionId, String role) {
        return checkerApproveRepository.updateCommissionStatus(commissionId, role);
    }
    
    public int insertCommissionTemp(String commissionId) {
        return checkerApproveRepository.insertCommissionTemp(commissionId);
    }
    
    public int insertCommissionNotes(String commissionId, String notes) {
        return checkerApproveRepository.insertCommissionNotes(commissionId, notes);
    }

    public int insertCommissionQuestion(String commissionId, String question) {
        return checkerApproveRepository.insertCommissionQuestion(commissionId, question);
    }

}