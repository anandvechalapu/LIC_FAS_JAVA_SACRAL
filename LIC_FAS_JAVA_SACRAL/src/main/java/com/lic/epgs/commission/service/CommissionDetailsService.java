package com.lic.epgs.commission.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.CommissionDetails;
import com.lic.epgs.commission.repository.CommissionDetailsRepository;

@Service
public class CommissionDetailsService {

    @Autowired
    CommissionDetailsRepository commissionDetailsRepository;

    public CommissionDetails saveCommissionDetails1_commission(CommissionDetails commissionDetails){
        return commissionDetailsRepository.saveCommissionDetails1_commission(commissionDetails);
    }
}