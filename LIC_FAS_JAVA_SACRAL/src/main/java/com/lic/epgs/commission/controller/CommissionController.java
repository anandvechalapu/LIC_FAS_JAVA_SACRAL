package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.model.CommissionDetails;
import com.lic.epgs.commission.model.CommissionNotesTemp;
import com.lic.epgs.commission.model.CommissionQuestionDetailsTemp;
import com.lic.epgs.commission.service.CommissionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @GetMapping("/{commissionDetailsId}")
    public Optional<Commission> findByCommissionDetailsId(@PathVariable Long commissionDetailsId) {
        return commissionService.findByCommissionDetailsId(commissionDetailsId);
    }

    @PutMapping("/{commissionId}")
    public int updateCommissionStatusAndWorkflowStatusByCommissionId(@PathVariable Long commissionId) {
        return commissionService.updateCommissionStatusAndWorkflowStatusByCommissionId(commissionId);
    }

    @GetMapping("/deleteByCommissionDetailsIdIsNull")
    public int deleteByCommissionDetailsIdIsNull() {
        return commissionService.deleteByCommissionDetailsIdIsNull();
    }

    @GetMapping("/findCommissionDetailsByCommissionDetailsId/{commissionDetailsId}")
    public Optional<CommissionDetails> findCommissionDetailsByCommissionDetailsId(@PathVariable Long commissionDetailsId) {
        return commissionService.findCommissionDetailsByCommissionDetailsId(commissionDetailsId);
    }

    @GetMapping("/findCommissionQuestionDetailsTempByCommissionDetailsId/{commissionDetailsId}")
    public List<CommissionQuestionDetailsTemp> findCommissionQuestionDetailsTempByCommissionDetailsId(@PathVariable Long commissionDetailsId) {
        return commissionService.findCommissionQuestionDetailsTempByCommissionDetailsId(commissionDetailsId);
    }

    @GetMapping("/findCommissionNotesTempByCommissionDetailsId/{commissionDetailsId}")
    public List<CommissionNotesTemp> findCommissionNotesTempByCommissionDetailsId(@PathVariable Long commissionDetailsId) {
        return commissionService.findCommissionNotesTempByCommissionDetailsId(commissionDetailsId);
    }

}