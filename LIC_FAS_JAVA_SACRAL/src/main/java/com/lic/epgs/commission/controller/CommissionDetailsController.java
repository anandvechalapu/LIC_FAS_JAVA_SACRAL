package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.CommissionDetails;
import com.lic.epgs.commission.service.CommissionDetailsService;

@RestController
@RequestMapping("/commission")
public class CommissionDetailsController {

    @Autowired
    CommissionDetailsService commissionDetailsService;

    @PostMapping("/saveCommission")
    public CommissionDetails saveCommission(@RequestBody CommissionDetails commissionDetails) {
        return commissionDetailsService.saveCommissionDetails1_commission(commissionDetails);
    }

}