package com.lic.epgs.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.trust.dto.BankAccountDetailsDto;
import com.lic.epgs.trust.service.ListTrustBankAccountDetailsService;

@RestController
public class ListTrustBankAccountDetailsController {

    @Autowired
    ListTrustBankAccountDetailsService listTrustBankAccountDetailsService;

    @GetMapping("/trust/{trustId}/bankAccountDetails")
    public List<BankAccountDetailsDto> getTrustBankAccountDetailsByTrustId(@PathVariable int trustId){
        return listTrustBankAccountDetailsService.getTrustBankAccountDetailsByTrustId(trustId);
    }

}