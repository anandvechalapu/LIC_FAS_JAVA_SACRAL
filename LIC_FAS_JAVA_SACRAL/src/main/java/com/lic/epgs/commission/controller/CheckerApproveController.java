package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.model.CommissionQuestion;
import com.lic.epgs.commission.model.CommissionTemp;
import com.lic.epgs.commission.service.CheckerApproveService;

@RestController
@RequestMapping("/commission")
public class CheckerApproveController {

    @Autowired
    private CheckerApproveService checkerApproveService;

    @PostMapping("/update/{commissionId}/{role}")
    public int updateCommissionStatus(@PathVariable String commissionId, @PathVariable String role) {
        return checkerApproveService.updateCommissionStatus(commissionId, role);
    }
    
    @PostMapping("/insertTemp/{commissionId}")
    public int insertCommissionTemp(@PathVariable String commissionId) {
        return checkerApproveService.insertCommissionTemp(commissionId);
    }
    
    @PostMapping("/insertNote")
    public int insertCommissionNotes(@RequestBody CommissionNotes commissionNotes) {
        return checkerApproveService.insertCommissionNotes(commissionNotes.getCommissionId(), commissionNotes.getNotes());
    }

    @PostMapping("/insertQuestion")
    public int insertCommissionQuestion(@RequestBody CommissionQuestion commissionQuestion) {
        return checkerApproveService.insertCommissionQuestion(commissionQuestion.getCommissionId(), commissionQuestion.getQuestion());
    }

}