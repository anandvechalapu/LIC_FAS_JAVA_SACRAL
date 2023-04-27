package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.service.LoadQuestionMaster6CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commission")
public class LoadQuestionMaster6CommissionController {

    @Autowired
    LoadQuestionMaster6CommissionService loadQuestionMaster6CommissionService;

    @GetMapping("/list")
    public List<CommonCommissionDto> getQuestionMaster6CommissionDetails(){
        return loadQuestionMaster6CommissionService.getQuestionMaster6CommissionDetails();
    }
}