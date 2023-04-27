package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionMasterDto;
import com.lic.epgs.commission.service.CommissionQuestionMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;

@RestController
@RequestMapping("/commission/questionmaster")
public class CommissionQuestionMasterController {

    @Autowired
    CommissionQuestionMasterService commissionQuestionMasterService;

    @PostMapping("/save")
    public CommonCommissionDto saveQuestionMaster2(@RequestBody CommissionQuestionMasterDto commissionQuestionMasterDto) throws ConstraintViolationException {
        return commissionQuestionMasterService.saveQuestionMaster2(commissionQuestionMasterDto);
    }

}